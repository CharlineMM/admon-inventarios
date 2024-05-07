public class Ropa extends Producto {
    protected String tipoPrenda;
    protected String talla;
    protected Boolean tieneCambio;
    protected int tiempoGaratia; //Dias

    public Ropa(String nombre, Double precioVenta, int cantidadStock, String proveedores, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, String tipoPrenda, String talla, Boolean tieneCambio, int tiempoGaratia) {
        super(nombre, precioVenta, cantidadStock, proveedores, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.tipoPrenda = tipoPrenda;
        this.talla = talla;
        this.tieneCambio = tieneCambio;
        this.tiempoGaratia = tiempoGaratia;
    }
}
