package Ejemplo3;

public abstract class Drone {
    String id;

    public Drone(String id) {
        this.id = id;
    }

    public void despegar() {
        System.out.println("Drone " + id + " despegando...");
    }

    public void aterrizar() {
        System.out.println("Drone " + id + " aterrizando...");
    }

    public abstract void ejecutarMision();
}
