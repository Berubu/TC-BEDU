package com.reto2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hospital {
    public static void main(String[] args) {
        System.out.println("🏥 Iniciando acceso a la Sala de cirugía...");
        RecursoMedico sala = new RecursoMedico("Sala de cirugía");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() -> sala.usar("Dra. Sánchez"));
        executor.execute(() -> sala.usar("Dr. Gómez"));
        executor.execute(() -> sala.usar("Enfermero López"));
        executor.execute(() -> sala.usar("Dra. Ramírez"));

        executor.shutdown();
    }
}
