package reto3;

import java.util.concurrent.*;

public class MovilidadApp {
    public static void main(String[] args) {
        System.out.println("🚦 Calculando ruta...");
        System.out.println("💰 Estimando tarifa...");

        CompletableFuture<String> ruta = calcularRuta();
        CompletableFuture<Double> tarifa = estimarTarifa();

        ruta.thenCombine(tarifa, (r, t) -> 
            "✅ 🚗 Ruta calculada: " + r + " | Tarifa estimada: $" + t
        ).exceptionally(ex -> "❌ Error en el proceso: " + ex.getMessage())
         .thenAccept(System.out::println);

        try { Thread.sleep(4000); } catch (InterruptedException e) {}
    }

    public static CompletableFuture<String> calcularRuta() {
        return CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2500); } catch (InterruptedException e) {}
            return "Centro -> Norte";
        });
    }

    public static CompletableFuture<Double> estimarTarifa() {
        return CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
            return 75.50;
        });
    }
}
