import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// En una version mas completa esta clase seria abstracta
public class Proveedor {
    protected int id;
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected String email;
    protected String tipoProveedor;
    protected List<Producto> productosProveedor;

    // Constructor rapido
    public Proveedor(String nombre, String tipoProveedor) {
        this.nombre = nombre;
        this.tipoProveedor = tipoProveedor;
        this.productosProveedor = new ArrayList<>(); // Lista vacia
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    // Constructor completo
    public Proveedor(String nombre, String direccion, int telefono, String email, String tipoProveedor, List<Producto> productosProveedor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoProveedor = tipoProveedor;
        this.productosProveedor = productosProveedor;
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    // Lista todos los productos
    public List<Producto> getProductos() {
        return productosProveedor;
    }

    // Agregar nuevos productos a la lista
    public void agregarProducto(Producto producto) {
        productosProveedor.add(producto);
    }

    // Elimina productos de la lista
    public void eliminarProducto(Producto producto) {
        productosProveedor.remove(producto);
    }

    // Entrega productos al supermercado
    public void reposicionProductos(String productosReponer) {
        /* Implementar logica para reitrar los productos
        del proveedor y agragarlos al supermercado
         */
        System.out.println("Se realizo la reposicion de Prodcutos: " + productosReponer);
    }
}
