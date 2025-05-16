package Ejemplo3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(null, 25);
        Empleado e2 = new Empleado(null, 25);
        boolean nombresIguales = Objects.equals(e1.nombre(), e2.nombre());
        System.out.println("Empleado 1: " + e1);
        System.out.println("Empleado 2: " + e2);
        System.out.println("¿Los nombres son iguales?: " + nombresIguales);
    }
}
