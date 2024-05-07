import java.util.Random;

public abstract class Producto {
    protected Long id;
    protected String nombre;
    protected Double precioVenta;
    protected int cantidadStock;
    protected String proveedores;
    protected int tiempoReposicion; //Dias
    protected String localizacionEnTienda;
    protected int demandaCliente;

    public Producto(String nombre, Double precioVenta, int cantidadStock, String proveedores, int tiempoReposicion, String localizacionEnTienda, int demandaCliente) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.proveedores = proveedores;
        this.tiempoReposicion = tiempoReposicion;
        this.localizacionEnTienda = localizacionEnTienda;
        this.demandaCliente = demandaCliente;
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextLong());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioVenta=" + precioVenta +
                ", cantidadStock=" + cantidadStock +
                ", proveedores='" + proveedores + '\'' +
                ", tiempoReposicion=" + tiempoReposicion +
                ", localizacionEnTienda='" + localizacionEnTienda + '\'' +
                ", demandaCliente=" + demandaCliente +
                '}';
    }

    public void pronosticarDemanda() {

    }


}
