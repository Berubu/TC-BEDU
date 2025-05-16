package Ejemplo4;

public class CarritoCompras {
    public static void main(String[] args) {
        String[] productos = {"Pan", "arroz", "arduino", "pantalla", "cascos"};

        System.out.println(" Productos en el carrito:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("- " + productos[i]);
        }

        System.out.println("\n Recorriendo con for-each:");
        for (String producto : productos) {
            if (producto.equals("casco")) continue;
            if (producto.equals("pan")) break;
            System.out.println("Producto válido: " + producto);
        }
    }
}