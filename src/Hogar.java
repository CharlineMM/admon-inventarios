public class Hogar extends Producto {
    protected int tiempoGarantia; //Dias
    protected String tipoMaterial;

    public Hogar(String nombre, Double precioVenta, int cantidadStock, String proveedores, int tiempoReposicion, String localizacionEnTienda, int demandaCliente, int tiempoGarantia, String tipoMaterial) {
        super(nombre, precioVenta, cantidadStock, proveedores, tiempoReposicion, localizacionEnTienda, demandaCliente);
        this.tiempoGarantia = tiempoGarantia;
        this.tipoMaterial = tipoMaterial;
    }
}
