package Solucion_R1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Paciente paciente1 = new Paciente();
        System.out.print("Ingrese el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");

        paciente1.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el numero del expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        paciente1.mostrarInformacion();
        scanner.close();
    }

}
