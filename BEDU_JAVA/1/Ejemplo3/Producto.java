package Ejemplo3;

public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
        System.out.println("Producto: " + nombre + " - Precio: $" + String.format("%,.2f", precio));

    }
}
