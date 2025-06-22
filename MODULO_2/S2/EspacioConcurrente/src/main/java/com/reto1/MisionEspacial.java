package com.reto1;

import java.util.concurrent.*;

public class MisionEspacial {
    public static void main(String[] args) throws Exception {
        System.out.println("🚀 Simulación de misión espacial iniciada...");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> nav = executor.submit(new SistemaNavegacion());
        Future<String> vital = executor.submit(new SistemaSoporteVital());
        Future<String> termico = executor.submit(new SistemaControlTermico());
        Future<String> comunicaciones = executor.submit(new SistemaComunicaciones());

        System.out.println(comunicaciones.get());
        System.out.println(vital.get());
        System.out.println(termico.get());
        System.out.println(nav.get());

        executor.shutdown();
        System.out.println("✅ Todos los sistemas reportan estado operativo.");
    }
}
