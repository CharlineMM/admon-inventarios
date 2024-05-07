import java.time.LocalDate;

public class Alimenticio extends Producto {
    protected String fechaVencimiento;
    protected String refrigeracion;

    public Alimenticio(String nombre, Double precioVenta, int cantidadStock, Proveedor proveedor, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, String fechaVencimiento, String refrigeracion) {
        super(nombre, precioVenta, cantidadStock, proveedor, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.fechaVencimiento = fechaVencimiento;
        this.refrigeracion = refrigeracion;
    }
}
