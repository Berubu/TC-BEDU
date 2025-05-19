package com.miempresa.narrativa.transicion;

import java.util.Map;

public class TransicionSimple implements TransicionHistoria {
    private final Map<String,String> mapaTransiciones;

    public TransicionSimple(Map<String,String> mapaTransiciones) {
        this.mapaTransiciones = mapaTransiciones;
    }

    @Override
    public String siguienteEscena(String decision) {
        return mapaTransiciones.getOrDefault(decision, "ESCENA_FINAL");
    }
}
