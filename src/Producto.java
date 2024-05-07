import java.util.List;
import java.util.Random;

public abstract class Producto {
    protected int id;
    protected String nombre;
    protected Double precioVenta;
    protected int cantidadStock;
    protected Proveedor proveedor;
    protected int tiempoReposicion; //Dias
    protected String localizacionEnTienda;
    protected int demandaCliente;

    public Producto(String nombre, Double precioVenta, int cantidadStock, Proveedor proveedor, int tiempoReposicion, String localizacionEnTienda, int demandaCliente) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.proveedor = proveedor;
        this.tiempoReposicion = tiempoReposicion;
        this.localizacionEnTienda = localizacionEnTienda;
        this.demandaCliente = demandaCliente;
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioVenta=" + precioVenta +
                ", cantidadStock=" + cantidadStock +
                ", proveedores='" + proveedor + '\'' +
                ", tiempoReposicion=" + tiempoReposicion +
                ", localizacionEnTienda='" + localizacionEnTienda + '\'' +
                ", demandaCliente=" + demandaCliente +
                '}';
    }

    public void reposicionProducto(Proveedor proveedor, String productosReponer) {
        if (cantidadStock < demandaCliente) {
            // llamar al provedor
            proveedor.reposicionProductos(productosReponer);
        }
        else {
            System.out.println("Todavia no se debe realizar reposicion del producto");
        }
    }

    public void pronosticarDemanda() {
    }
}
