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
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
