package Ejemplo1;

public class TicketSoporte {
    private String titulo;
    private String categoria;
    private int prioridad;
    private boolean estaActivo;

    public TicketSoporte() {
        this.titulo = "Sin título";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }

    public TicketSoporte(String titulo, String categoria, int prioridad) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }

    public TicketSoporte(TicketSoporte otro) {
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = otro.estaActivo;
    }

    public TicketSoporte(String titulo) {
        this.titulo = titulo;
        this.categoria = "Sin categoría";
        this.prioridad = 3;
        this.estaActivo = true;
    }

    public void mostrarInfo() {
        System.out.println("Ticket: " + titulo);
        System.out.println("Categoría: " + categoria);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Estado: " + (estaActivo ? "Activo" : "Cerrado"));
    }

    public void cerrar() {
        estaActivo = false;
        System.out.println("El ticket '" + titulo + "' ha sido cerrado.");
    }
}
