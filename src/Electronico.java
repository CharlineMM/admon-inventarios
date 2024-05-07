public class Electronico extends Producto {
    protected int tiempoGarantia; //Meses

    public Electronico(String nombre, Double precioVenta, int cantidadStock, String proveedores, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, int tiempoGarantia) {
        super(nombre, precioVenta, cantidadStock, proveedores, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.tiempoGarantia = tiempoGarantia;
    }
}
