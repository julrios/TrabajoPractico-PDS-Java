package notification;

public class NotificadorSMS extends Notificador {
    private static NotificadorSMS instance;

    private NotificadorSMS() {}

    public static NotificadorSMS getInstance() {
        if (instance == null) {
            instance = new NotificadorSMS();
        }
        return instance;
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("SMS enviado a " + destinatario + ": " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("NotificadorSMS recibió mensaje: " + mensaje);
    }
}
