package com.miempresa.qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaLogs    = Paths.get("errores.log");
        Path rutaFallo   = Paths.get("registro_fallos.txt");

        try {
            analizarLogs(rutaLogs);
        } catch (IOException e) {
            System.err.println("Se produjo un error al procesar los logs: " + e.getMessage());
            registrarFallo(rutaFallo, e.getMessage());
        }
    }

    /**
     * Lee línea a línea el archivo de logs, cuenta errores y advertencias,
     * e imprime un resumen al finalizar.
     */
    private static void analizarLogs(Path ruta) throws IOException {
        int totalLineas   = 0;
        int errores       = 0;
        int advertencias  = 0;

        // try-with-resources asegura el cierre automático del BufferedReader
        try (BufferedReader reader = Files.newBufferedReader(ruta)) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }
        }

        // Cálculo de porcentajes
        double pctErrores      = totalLineas > 0 ? (errores * 100.0 / totalLineas) : 0;
        double pctAdvertencias = totalLineas > 0 ? (advertencias * 100.0 / totalLineas) : 0;

        // Resumen por consola
        System.out.println("===== Resumen de análisis de logs =====");
        System.out.println("Total de líneas leídas      : " + totalLineas);
        System.out.println("Cantidad de errores (ERROR): " + errores);
        System.out.println("Cantidad de advertencias   : " + advertencias);
        System.out.printf("%% Líneas con ERROR         : %.2f%%%n", pctErrores);
        System.out.printf("%% Líneas con WARNING       : %.2f%%%n", pctAdvertencias);
    }

    /**
     * Guarda el mensaje de excepción en un archivo de registro de fallos.
     * Si el archivo ya existe, añade la nueva línea al final.
     */
    private static void registrarFallo(Path ruta, String mensaje) {
        String lineaRegistro = String.format("%s: %s%n",
                java.time.LocalDateTime.now(), mensaje);
        try {
            Files.writeString(
                    ruta,
                    lineaRegistro,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("Se registró el fallo en: " + ruta.toAbsolutePath());
        } catch (IOException ioEx) {
            System.err.println("No fue posible escribir el registro de fallos: " + ioEx.getMessage());
        }
    }
}
