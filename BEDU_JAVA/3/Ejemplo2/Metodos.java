package Ejemplo2;

public class Metodos {

    public void mostrarBienvenida() {
        System.out.println("Bienvenido al sistema");
    }

    public void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    public int obtenerSuma(int a, int b) {
        return a + b;
    }

    public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    public void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }

    public void saludar() {
        System.out.println("Hola");
    }

    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
}
