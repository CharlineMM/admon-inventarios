public class Electronico extends Producto {
    protected int tiempoGarantia; //Meses

    public Electronico(String nombre, Double precioVenta, int cantidadStock, Proveedor proveedor, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, int tiempoGarantia) {
        super(nombre, precioVenta, cantidadStock, proveedor, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.tiempoGarantia = tiempoGarantia;
    }
}
