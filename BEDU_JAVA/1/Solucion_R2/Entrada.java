package Solucion_R1;

public class Entrada {
    String evento;
    double precio;
    // constructor
    public Entrada(double precio, String evento) {
        this.evento = evento;
        this.precio = precio;
    }
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
