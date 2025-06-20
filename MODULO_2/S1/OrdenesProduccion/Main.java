import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear órdenes
        List<OrdenMasa> ordenesMasa = Arrays.asList(
            new OrdenMasa("A123", 500),
            new OrdenMasa("A124", 750)
        );

        List<OrdenPersonalizada> ordenesPersonalizadas = Arrays.asList(
            new OrdenPersonalizada("P456", 100, "ClienteX"),
            new OrdenPersonalizada("P789", 150, "ClienteY")
        );

        List<OrdenPrototipo> ordenesPrototipo = Arrays.asList(
            new OrdenPrototipo("T789", 10, "Diseño"),
            new OrdenPrototipo("T790", 5, "Pruebas")
        );

        // Mostrar todas las órdenes
        Utilidades.mostrarOrdenes(ordenesMasa);
        Utilidimport java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear órdenes
        List<OrdenMasa> ordenesMasa = Arrays.asList(
            new OrdenMasa("A123", 500),
            new OrdenMasa("A124", 750)
        );

        List<OrdenPersonalizada> ordenesPersonalizadas = Arrays.asList(
            new OrdenPersonalizada("P456", 100, "ClienteX"),
            new OrdenPersonalizada("P789", 150, "ClienteY")
        );

        List<OrdenPrototipo> ordenesPrototipo = Arrays.asList(
            new OrdenPrototipo("T789", 10, "Diseño"),
            new OrdenPrototipo("T790", 5, "Pruebas")
        );

        // Mostrar todas las órdenes
        Utilidades.mostrarOrdenes(ordenesMasa);
        Utilidades.mostrarOrdenes(ordenesPersonalizadas);
        Utilidades.mostrarOrdenes(ordenesPrototipo);

        // Procesar personalizadas
        Utilidades.procesarPersonalizadas(new ArrayList<>(ordenesPersonalizadas), 200);

        // Desafío adicional: contar tipos
        System.out.println("📊 Resumen total de órdenes:");
        System.out.println("🔧 Producción en masa: " + ordenesMasa.size());
        System.out.println("🛠️ Personalizadas: " + ordenesPersonalizadas.size());
        System.out.println("🧪 Prototipos: " + ordenesPrototipo.size());
    }
}
ades.mostrarOrdenes(ordenesPersonalizadas);
        Utilidades.mostrarOrdenes(ordenesPrototipo);

        // Procesar personalizadas
        Utilidades.procesarPersonalizadas(new ArrayList<>(ordenesPersonalizadas), 200);

        // Desafío adicional: contar tipos
        System.out.println("📊 Resumen total de órdenes:");
        System.out.println("🔧 Producción en masa: " + ordenesMasa.size());
        System.out.println("🛠️ Personalizadas: " + ordenesPersonalizadas.size());
        System.out.println("🧪 Prototipos: " + ordenesPrototipo.size());
    }
}
