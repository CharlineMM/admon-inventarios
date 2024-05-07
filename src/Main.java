import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alimenticio pollo = new Alimenticio("Pollo", 12000.00, 150, "MacPollo", 7, "Neveras", 200, LocalDate.of(2024,05, 05));
        System.out.println(pollo.toString());
        System.out.println(pollo.getFechaVencimiento());
    }
}
