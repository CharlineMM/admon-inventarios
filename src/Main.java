import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creacion rapida de proveedores
        Proveedor MacPollo = new Proveedor("MacPollo", "Alimentos");
        Proveedor Zenu = new Proveedor("Zenu", "Alimentos");
        Proveedor JBL = new Proveedor("JBL", "Electronicos");
        Proveedor Oster = new Proveedor("Oster", "Hogar");
        Proveedor Levis = new Proveedor("Levis", "Ropa");

        // Creacion de productos
        Alimenticio pollo = new Alimenticio("Pollo", 12000.00, 150, MacPollo, 7, "Neveras", 200, "2024-05-20", "si");
        Alimenticio salchicha = new Alimenticio("Salchicha", 8000.00, 3000, Zenu, 15, "Neveras", 2000, "2024-05-30", "si");
        Electronico bafle = new Electronico("Bafle JBL", 949999.99, 1024, JBL, 30, "Pasillo Tecnologia", 900, 12);
        Hogar licuadora = new Hogar("LicuaMix3000", 230000.99, 250, Oster, 100, "Pasillo Cocina", 100,24,"Metalico");
        Ropa jean = new Ropa("JeanClasico", 120500.0, 340, Levis, 180, "Pasillo Ropa", 250, "Exterior", "8", "si", 90);


        /* PROCESO DE REPONER UN PRODUCTO */
        System.out.println(" ");
        pollo.reposicionProducto(MacPollo, "pollo"); // Proceso exitoso
        System.out.println(" ");
        salchicha.reposicionProducto(Zenu, "rancheras"); // Proceso NO existoso


        /* PROCESO DE GENERAR UNA COMPRA POR PARTE DE UN CLIENTE
        *  Y FIDELIZACION POR MEDIO DE SISTEMA DE PUNTOS */

        // Lista de productos
        List<Producto> productosMercado = new ArrayList<>();

        // Adicion de productos a la lista
        productosMercado.add(pollo);
        productosMercado.add(salchicha);

        // Creacion rapida de cliente
        Cliente Charline = new Cliente("Charline", 5555555);
        System.out.println(" ");
        System.out.println(Charline.toString());

        // Cliente realiza compra
        Compra mercadoDeChar = new Compra(productosMercado, 147000, "2024-05-07");
        System.out.println(" ");
        System.out.println(mercadoDeChar.toString());

        // Fidelizacion del cliente
        System.out.println(" ");
        Charline.otorgarPuntosCompra(147000); // Realiza otra compra para mostrar acomulacion de puntos
        System.out.println("-------");
        Charline.otorgarPuntosCompra(800000);
        System.out.println("-------");
        Charline.canjearPuntos(500);

    }

}
