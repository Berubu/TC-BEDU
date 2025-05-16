package Ejemplo3;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mario", 500.0);
        Empleado empleado = new Empleado();

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Saldo inicial: $" + usuario.getSaldo());
        usuario.depositar(250.0);
        System.out.println("Saldo después del depósito: $" + usuario.getSaldo());

        System.out.println("Nacionalidad antes del cambio:");
        empleado.mostrarNacionalidad();

        empleado.nacionalidad = "Reino Unido";

        System.out.println("Nacionalidad después del cambio:");
        empleado.mostrarNacionalidad();
    }
}
