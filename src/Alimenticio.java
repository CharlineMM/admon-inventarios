import java.time.LocalDate;

public class Alimenticio extends Producto {
    protected LocalDate fechaVencimiento;

    public Alimenticio(String nombre, Double precioVenta, int cantidadStock, String proveedores, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, LocalDate fechaVencimiento) {
        super(nombre, precioVenta, cantidadStock, proveedores, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.fechaVencimiento = fechaVencimiento;
    }
}
