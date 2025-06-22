package reto2;

import java.util.List;

public class Sucursal {
    public String nombre;
    public List<Encuesta> encuestas;

    public Sucursal(String nombre, List<Encuesta> encuestas) {
        this.nombre = nombre;
        this.encuestas = encuestas;
    }
}
