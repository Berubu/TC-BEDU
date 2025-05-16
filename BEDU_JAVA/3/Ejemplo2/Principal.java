package Ejemplo2;

public class Principal {
    public static void main(String[] args) {
        Metodos util = new Metodos();

        util.mostrarBienvenida();

        util.mostrarSuma(10, 20);

        int resultado = util.obtenerSuma(5, 7);
        System.out.println("Resultado: " + resultado);

        int numeroOriginal = 15;
        util.duplicar(numeroOriginal);
        System.out.println("Fuera del método: " + numeroOriginal);

        Persona persona = new Persona("Mario");
        util.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);

        util.saludar();
        util.saludar("Mario");
    }
}
