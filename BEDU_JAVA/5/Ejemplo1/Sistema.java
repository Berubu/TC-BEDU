package Ejemplo1;

public class Sistema {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "ana@correo.com");
        email.enviar();
        email.enviarEmail();
    }
}
