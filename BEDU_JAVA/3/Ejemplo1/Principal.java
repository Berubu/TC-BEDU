package Ejemplo1;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Sistema: " + Proyecto.NOMBRE_SISTEMA);

        Proyecto p1 = new Proyecto("Sitio Web Corporativo", "Cliente A", 12, true);
        Proyecto p2 = new Proyecto("Aplicación Móvil", "Cliente B", 20, true);

        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
        System.out.println();

        p1.cerrarProyecto();

        System.out.println();
        p1.mostrarInformacion();

        System.out.println("\nTotal de proyectos creados: " + Proyecto.totalProyectos);
    }
}
