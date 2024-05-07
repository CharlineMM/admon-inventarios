import java.util.List;
import java.util.Random;

public class Compra {
    protected int id;
    protected List<Producto> productos; // Productos que integran la compra
    protected double total;
    protected String fecha;

    // Constructor
    public Compra(List<Producto> productos, double total, String fecha) {
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    @Override
    public String toString() {
        return "Compra{" +
                "productos=" + productos +
                ", total=" + total +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
