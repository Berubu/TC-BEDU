package Solucion_Re1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SimuladorFarmacia {

    private static final BigDecimal LIMITE_DESCUENTO = new BigDecimal("500");
    private static final BigDecimal PORCENTAJE_DESCUENTO = new BigDecimal("0.15");
    private static final NumberFormat MONEDA_MX = NumberFormat.getCurrencyInstance(new Locale("es", "MX"));

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Compra compra = leerDatos(sc);
            calcularDescuento(compra);
            imprimirResumen(compra);
        }
    }
    private static Compra leerDatos(Scanner sc) {
        System.out.print("Nombre del medicamento: ");
        String nombre = sc.nextLine().trim();

        BigDecimal precio;
        do {
            System.out.print("Precio unitario ($): ");
            precio = leerBigDecimalPositivo(sc);
        } while (precio == null);

        int piezas;
        do {
            System.out.print("Cantidad de piezas: ");
            piezas = leerEnteroPositivo(sc);
        } while (piezas <= 0);

        return new Compra(nombre, precio, piezas);
    }

    private static void calcularDescuento(Compra c) {
        BigDecimal subtotal = c.getPrecioUnitario().multiply(BigDecimal.valueOf(c.getCantidad()));
        c.setSubtotal(subtotal);
        boolean aplica = subtotal.compareTo(LIMITE_DESCUENTO) > 0;
        c.setAplicaDescuento(aplica);
        BigDecimal descuento = aplica ? subtotal.multiply(PORCENTAJE_DESCUENTO) : BigDecimal.ZERO;
        c.setDescuento(descuento);
        c.setTotal(subtotal.subtract(descuento));
    }

    private static void imprimirResumen(Compra c) {
        System.out.println("\n─  Resumen de compra  ─────────────────");
        System.out.printf("Medicamento        : %s%n", c.getMedicamento());
        System.out.printf("Cantidad           : %d%n", c.getCantidad());
        System.out.printf("Precio unitario    : %s%n", MONEDA_MX.format(c.getPrecioUnitario()));
        System.out.printf("Subtotal           : %s%n", MONEDA_MX.format(c.getSubtotal()));
        System.out.printf("¿Aplica descuento? : %b%n", c.isAplicaDescuento());
        System.out.printf("Descuento          : %s%n", MONEDA_MX.format(c.getDescuento()));
        System.out.printf("TOTAL A PAGAR      : %s%n", MONEDA_MX.format(c.getTotal()));
        System.out.println("───────────────────────────────────────");
    }
    private static BigDecimal leerBigDecimalPositivo(Scanner sc) {
        try {
            BigDecimal valor = sc.nextBigDecimal();
            sc.nextLine();
            if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                System.out.println("El valor debe ser mayor a 0.");
                return null;
            }
            return valor.setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.out.println("⚠ Entrada no válida. Intenta de nuevo.");
            sc.nextLine();
            return null;
        }
    }
    private static int leerEnteroPositivo(Scanner sc) {
        try {
            int n = sc.nextInt();
            sc.nextLine();
            if (n <= 0) {
                System.out.println("El número debe ser positivo.");
            }
            return n;
        } catch (Exception e) {
            System.out.println("Entrada no válida. Intenta de nuevo.");
            sc.nextLine();
            return -1;
        }
    }
    private static class Compra

    public BigDecimal getPrecioUnitario() {

    }

    public Compra(String nombre, BigDecimal precio, int piezas) {
    }
