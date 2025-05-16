package Ejemplo1;

public class NotificacionEmail extends Notificacion {
    String destinatario;

    public NotificacionEmail(String mensaje, String destinatario) {
        super(mensaje);
        this.destinatario = destinatario;
    }

    public void enviarEmail() {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
