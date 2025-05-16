package Ejemplo1;

public class Proyecto {

    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estaActivo;

    public static int totalProyectos = 0;
    public static final String NOMBRE_SISTEMA = "GestorProyectos v1.0";

    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++;
    }

    public void mostrarInformacion() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Cliente: " + cliente);
        System.out.println("Duración: " + duracionSemanas + " semanas");
        System.out.println("¿Activo?: " + (estaActivo ? "Sí" : "No"));
    }

    public void cerrarProyecto() {
        estaActivo = false;
        System.out.println("El proyecto '" + nombre + "' ha sido cerrado.");
    }
}
