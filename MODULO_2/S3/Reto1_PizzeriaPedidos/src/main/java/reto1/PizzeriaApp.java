package reto1;

import java.util.*;
import java.util.stream.*;

public class PizzeriaApp {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
            new Pedido("Carlos", "domicilio", "555-1234"),
            new Pedido("Ana", "local", null),
            new Pedido("Luis", "domicilio", "555-5678"),
            new Pedido("Marta", "domicilio", null)
        );

        pedidos.stream()
            .filter(p -> "domicilio".equalsIgnoreCase(p.getTipoEntrega()))
            .map(Pedido::getTelefono)
            .flatMap(Optional::stream)
            .map(tel -> "📞 Confirmación enviada al número: " + tel)
            .forEach(System.out::println);
    }
}
