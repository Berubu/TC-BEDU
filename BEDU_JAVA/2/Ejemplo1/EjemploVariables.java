package Ejemplo1;

public class EjemploVariables {
    public static void main(String[] args) {
        int edad = 28;
        double salario = 15499.50;
        boolean activo = true;
        char inicial = 'M';
        var ciudad = "Zermatt";
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
        System.out.println("Activo: " + activo);
        System.out.println("inicial: " + inicial);
        System.out.println("ciudad: " + ciudad);


        double precio = 197.99;
        int precioRedondeado = (int) precio;
        System.out.println("precio original: " + precio);
        System.out.println("precio redondeado: " + precioRedondeado);
    }
}