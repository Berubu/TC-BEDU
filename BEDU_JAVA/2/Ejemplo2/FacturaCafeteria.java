package Ejemplo2;

public class FacturaCafeteria {
    public static void main(String[] args) {

        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua = 20.00;
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;
        cantidadPastel++;


        double total = (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);
        boolean aplicaDescuento = total > 150;
        double descuento = aplicaDescuento ? total * 0.10 : 0;
        double totalFinal = total - descuento;


        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}