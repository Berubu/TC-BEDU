package reto2;

import java.util.*;
import java.util.stream.*;

public class EncuestaApp {
    public static void main(String[] args) {
        Sucursal centro = new Sucursal("Centro", Arrays.asList(
            new Encuesta("Paciente1", "El tiempo de espera fue largo", 2),
            new Encuesta("Paciente2", null, 4)
        ));
        Sucursal norte = new Sucursal("Norte", Arrays.asList(
            new Encuesta("Paciente3", "La atención fue buena, pero la limpieza puede mejorar", 3),
            new Encuesta("Paciente4", null, 5)
        ));

        List<Sucursal> sucursales = Arrays.asList(centro, norte);

        sucursales.stream()
            .flatMap(sucursal -> 
                sucursal.encuestas.stream()
                    .filter(e -> e.getCalificacion() <= 3)
                    .map(e -> e.getComentario()
                        .map(c -> "Sucursal " + sucursal.nombre + ": Seguimiento a paciente con comentario: "" + c + """))
                    .flatMap(Optional::stream)
            ).forEach(System.out::println);
    }
}
