package Ejemplo4;

public class CentroControl {
    public static void main(String[] args) {
        AnimalRobot[] zoologico = {
                new PerroRobot(),
                new GatoRobot(),
                new PajaroRobot()
        };

        for (AnimalRobot robot : zoologico) {
            robot.hacerSonido();
        }
    }
}
