import java.util.List;
import java.util.Random;

public class Cliente implements SistemaFidelizacion {
    protected int id;
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected String email;
    protected List<Compra> historialCompras;
    protected int puntos;

    // Creacion rapida de un cliente
    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.puntos = 0;
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    // Creacion completa de un cliente
    public Cliente(String nombre, String direccion, int telefono, String email, List<Compra> historialCompras) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.historialCompras = historialCompras;
        this.puntos = 0; // Todos los clientes inician con 0 puntos
        Random randomNumbers = new Random();
        this.id = Math.abs(randomNumbers.nextInt());
    }

    @Override
    public void otorgarPuntosCompra(double montoCompra) {
        // Se otorga 1 punto por cada 1000 pesos
        int puntosOtorgados = (int) (montoCompra / 1000);
        puntos += puntosOtorgados;
        System.out.println("Se han otorgado " + puntosOtorgados + " puntos al cliente " + nombre + " por una compra de $" + montoCompra);
        puntosTotalAcumulados(); // Llamda al metodo que muestra el total de puntos
    }

    public void puntosTotalAcumulados() {
        // Muestra el total de puntos acomulados
        System.out.println("Total " + puntos + " puntos acomulados " + nombre);
    }

    @Override
    public void canjearPuntos(int puntosCanjeados) {
        puntos -= puntosCanjeados; // Disminuye los puntos acomulados
        System.out.println("Ha canjeado puntos: " + puntosCanjeados);
        puntosTotalAcumulados();
    }

    @Override
    public void recordatrioMercado() {
        /*
        Crear un sistema de analisis de datos
        * con la informacion de el hsitorial de compras
        * en productos categoria alimenticios
        * para enviar al cliente informacion de promociones
        * de los productos que habitualmente compra
        * y pronosticar en que fecha los va a volver
        * a comprar
        */
        System.out.println("RECORDATORIO DE COMPRAS");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", historialCompras=" + historialCompras +
                ", puntos=" + puntos +
                '}';
    }
}
