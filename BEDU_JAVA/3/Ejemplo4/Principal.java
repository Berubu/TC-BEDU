package Ejemplo4;

public class Principal {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("555-1234");
        Contacto c2 = new Contacto(null);

        if (c1.getTelefono().isPresent()) {
            System.out.println("Teléfono: " + c1.getTelefono().get());
        }

        c2.getTelefono().ifPresent(tel -> System.out.println("Teléfono: " + tel));

        String tel1 = c1.getTelefono().orElse("No registrado");
        String tel2 = c2.getTelefono().orElse("No registrado");

        System.out.println("Teléfono 1: " + tel1);
        System.out.println("Teléfono 2: " + tel2);

        String telSeguro = c1.getTelefono().orElseThrow(() -> new RuntimeException("Teléfono obligatorio"));
    }
}
