package Ejemplo3;

import java.util.Scanner;

public class EnvioPaqueteriaSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tipo de paquete (pequeño, mediano, grande): ");
        String tipo = scanner.nextLine();

        double costo = switch (tipo.toLowerCase()) {
            case "pequeño" -> 49.99;
            case "mediano" -> 89.99;
            case "grande" -> 149.99;
            default -> {
                System.out.println("Tipo no válido.");
                yield 0.0;
            }
        };
        System.out.println("Costo del envío: $" + costo);
    }
}