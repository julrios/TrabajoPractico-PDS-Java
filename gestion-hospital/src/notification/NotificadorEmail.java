package notification;

public class NotificadorEmail extends Notificador {
    private static NotificadorEmail instance;

    private NotificadorEmail() {}

    public static NotificadorEmail getInstance() {
        if (instance == null) {
            instance = new NotificadorEmail();
        }
        return instance;
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Email enviado a " + destinatario + ": " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("NotificadorEmail recibió mensaje: " + mensaje);
    }
}
