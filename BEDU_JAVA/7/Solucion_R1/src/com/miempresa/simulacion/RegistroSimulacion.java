package com.miempresa.simulacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config", "parametros.txt");
        String contenido = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        try {
            guardarParametros(rutaArchivo, contenido);
            leerParametros(rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
    private static void guardarParametros(Path ruta, String texto) throws IOException {
        // crear directorio config/ si no existe
        Path carpeta = ruta.getParent();
        if (carpeta != null && !Files.exists(carpeta)) {
            Files.createDirectories(carpeta);
            System.out.println("Carpeta creada en: " + carpeta.toAbsolutePath());
        }

        // escribir el archivo sobrescribe si ya existia
        Files.write(ruta, texto.getBytes());
        System.out.println("Archivo creado en: " + ruta.toAbsolutePath());
    }

    private static void leerParametros(Path ruta) throws IOException {
        // 3. Validar existencia
        if (Files.exists(ruta)) {
            System.out.println("El archivo existe. Leyendo contenido...\n");

            // 4. Leer todo el archivo como String
            String data = Files.readString(ruta);
            System.out.println(data);
        } else {
            System.out.println("El archivo NO existe en: " + ruta.toAbsolutePath());
        }
    }
}
