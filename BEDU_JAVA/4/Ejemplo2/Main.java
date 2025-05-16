package Ejemplo2;

public class Main {
    public static void main(String[] args) {

        TicketSoporte t1 = new TicketSoporte("Error de login", "Accesos", 1);
        TicketSoporte t2 = new TicketSoporte("Error de login", "Accesos", 1);

        System.out.println("¿Son iguales? " + t1.equals(t2));
        System.out.println("Hash de t1: " + t1.hashCode());
        System.out.println("Hash de t2: " + t2.hashCode());

        System.out.println("Ticket 1:");
        System.out.println(t1);
    }
}
