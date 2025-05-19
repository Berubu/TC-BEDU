package com.miempresa.narrativa;

import com.miempresa.narrativa.decision.LogicaDecision;
import com.miempresa.narrativa.decision.DecisionBinaria;
import com.miempresa.narrativa.transicion.TransicionHistoria;
import com.miempresa.narrativa.transicion.TransicionSimple;
import com.miempresa.narrativa.dialogo.GestorDialogo;
import com.miempresa.narrativa.dialogo.DialogoTexto;

import java.util.Map;

public class MainNarrativa {
    public static void main(String[] args) {
        //guiones y transiciones
        Map<String,String> guion = Map.of(
                "ESCENA_INICIAL", "Te despiertas en un bosque oscuro. ¿Vas por el camino A o B?",
                "ESCENA_A", "Te adentras en lo claro y encuentras un anciano.",
                "ESCENA_B", "Caes en una trampa y te rescata un lobo amistoso.",
                "ESCENA_FINAL", "La historia termina aquí..."
        );

        Map<String,String> transiciones = Map.of(
                "A", "ESCENA_A",
                "B", "ESCENA_B"
        );
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple(transiciones);
        GestorDialogo dialogo = new DialogoTexto(guion);

        String escenaActual = "ESCENA_INICIAL";
        dialogo.mostrarDialogo(escenaActual);

        String eleccion = decision.decidir();
        escenaActual = transicion.siguienteEscena(eleccion);
        dialogo.mostrarDialogo(escenaActual);

        escenaActual = transicion.siguienteEscena("X");
        dialogo.mostrarDialogo(escenaActual);
    }
}
