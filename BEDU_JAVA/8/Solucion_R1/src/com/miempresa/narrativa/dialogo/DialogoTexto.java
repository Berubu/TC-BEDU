package com.miempresa.narrativa.dialogo;

import java.util.Map;

public class DialogoTexto implements GestorDialogo {
    private final Map<String,String> guion;

    public DialogoTexto(Map<String,String> guion) {
        this.guion = guion;
    }

    @Override
    public void mostrarDialogo(String escena) {
        System.out.println(guion.getOrDefault(escena, "…El silencio lo dice todo…"));
    }
}
