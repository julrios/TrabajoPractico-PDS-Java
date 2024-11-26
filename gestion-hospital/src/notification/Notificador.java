package notification;

import interfaces.Observer;

public abstract class Notificador implements Observer {
    public abstract void enviarNotificacion(String destinatario, String mensaje);
}
