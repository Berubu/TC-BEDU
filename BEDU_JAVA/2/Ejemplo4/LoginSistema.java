package Ejemplo4;
import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "isisa";
        String input;
        int intentos = 0;
        int maxIntentos =    3;
        while (intentos < maxIntentos) {
            System.out.print("ingresa tu contraseña: ");
            input = scanner.nextLine();
            if (input.equals(contraseñaCorrecta)) {
                System.out.println("acceso concedido.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Cuenta bloqueada por demasiados intentos.");
        }
        scanner.close();
    }
}
