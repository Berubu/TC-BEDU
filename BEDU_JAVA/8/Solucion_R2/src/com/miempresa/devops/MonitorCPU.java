package com.miempresa.devops;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> consumosRegistrados = new HashSet<>();
        String entrada = null;
        System.out.println("=== Herramienta de Monitoreo de CPU ===");
        System.out.println("Ingresa valores de consumo (%) uno a uno.");
        System.out.println("Para finalizar, escribe 'salir' y presiona Enter.\n");

        try {
            while (true) {
                System.out.print("Consumo (%): ");
                entrada = scanner.nextLine().trim();
                // Salir del bucle
                if (entrada.equalsIgnoreCase("salir")) {
                    System.out.println("\nFinalizando monitoreo.");
                    break;
                }
                double valor;
                // validar que sea numérico
                try {
                    valor = Double.parseDouble(entrada);
                } catch (NumberFormatException nfe) {
                    System.err.println("❌ Entrada inválida: no es un número. Intenta de nuevo.");
                    continue;
                }
                // validar rango 0–100
                if (valor < 0 || valor > 100) {
                    System.err.println("❌ Valor fuera de rango (0–100%). Intenta de nuevo.");
                    continue;
                }
                // detectar duplicados
                if (consumosRegistrados.contains(valor)) {
                    System.err.println("⚠️ Valor duplicado: ya se registró " + valor + "%. Ignorado.");
                    continue;
                }
                // umbral crítico
                if (valor > 95) {
                    throw new ConsumoCriticoException(
                            "🔥 Consumo crítico detectado: " + valor + "% supera el umbral de 95%."
                    );
                }
                // si todo OK, agregar y notificar
                consumosRegistrados.add(valor);
                System.out.println("✔️ Registro exitoso: " + valor + "%\n");
            }
        } catch (ConsumoCriticoException cce) {
            System.err.println("\n*** EXCEPCIÓN CRÍTICA ***");
            System.err.println(cce.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos liberados. Aplicación terminada.");
        }
    }
}
