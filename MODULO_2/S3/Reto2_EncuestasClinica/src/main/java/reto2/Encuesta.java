package reto2;

import java.util.Optional;

public class Encuesta {
    public String paciente;
    public String comentario;
    public int calificacion;

    public Encuesta(String paciente, String comentario, int calificacion) {
        this.paciente = paciente;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public Optional<String> getComentario() {
        return Optional.ofNullable(comentario);
    }

    public int getCalificacion() {
        return calificacion;
    }
}
