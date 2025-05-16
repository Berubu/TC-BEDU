package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        TicketSoporte ticket1 = new TicketSoporte();
        System.out.println("\nTicket creado con constructor por defecto:");
        ticket1.mostrarInfo();

        TicketSoporte ticket2 = new TicketSoporte("Error al iniciar sesión", "Accesos", 1);
        System.out.println("\nTicket creado con parámetros:");
        ticket2.mostrarInfo();

        ticket2.cerrar();
        ticket2.mostrarInfo();

        TicketSoporte ticket3 = new TicketSoporte(ticket2);
        System.out.println("\nTicket copiado desde otro:");
        ticket3.mostrarInfo();

        TicketSoporte ticket4 = new TicketSoporte("Consulta sobre facturación");
        System.out.println("\nTicket con constructor sobrecargado (solo título):");
        ticket4.mostrarInfo();
    }
}
