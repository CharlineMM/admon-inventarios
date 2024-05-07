import javax.swing.*;

public class Ropa extends Producto {
    protected String tipoPrenda;
    protected String talla;
    protected String tieneCambio;
    protected int tiempoGaratia; //Dias

    public Ropa(String nombre, Double precioVenta, int cantidadStock, Proveedor proveedor, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, String tipoPrenda, String talla, String tieneCambio, int tiempoGaratia) {
        super(nombre, precioVenta, cantidadStock, proveedor, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.tipoPrenda = tipoPrenda;
        this.talla = talla;
        this.tieneCambio = tieneCambio;
        this.tiempoGaratia = tiempoGaratia;
    }
}
