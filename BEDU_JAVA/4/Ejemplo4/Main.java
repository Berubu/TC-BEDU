package Ejemplo4;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        empleado.setNombre("Valeria");
        empleado.setEdad(29);
        empleado.mostrarInfo();

        Contrato contrato = new Contrato("Tiempo completo", 25000.00);
        contrato.mostrarInfo();
    }
}
