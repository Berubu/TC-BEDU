package reto4;

import java.util.concurrent.*;
import java.util.Random;

public class AeropuertoControl {
    public static void main(String[] args) {
        System.out.println("🛫 Verificando condiciones para aterrizaje...");

        CompletableFuture<Boolean> pista = verificar("🛣️ Pista", 0.8);
        CompletableFuture<Boolean> clima = verificar("🌦️ Clima", 0.85);
        CompletableFuture<Boolean> trafico = verificar("🚦 Tráfico aéreo", 0.9);
        CompletableFuture<Boolean> personal = verificar("👷‍♂️ Personal", 0.95);

        CompletableFuture.allOf(pista, clima, trafico, personal).thenRun(() -> {
            try {
                if (pista.get() && clima.get() && trafico.get() && personal.get()) {
                    System.out.println("🛬 Aterrizaje autorizado: todas las condiciones óptimas.");
                } else {
                    System.out.println("🚫 Aterrizaje denegado: condiciones no óptimas.");
                }
            } catch (Exception e) {
                System.out.println("🚫 Error en verificación: " + e.getMessage());
            }
        });

        try { Thread.sleep(4000); } catch (InterruptedException e) {}
    }

    public static CompletableFuture<Boolean> verificar(String nombre, double probabilidad) {
        return CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000 + new Random().nextInt(1000)); } catch (InterruptedException e) {}
            boolean resultado = Math.random() < probabilidad;
            System.out.println(nombre + " disponible: " + resultado);
            return resultado;
        });
    }
}
