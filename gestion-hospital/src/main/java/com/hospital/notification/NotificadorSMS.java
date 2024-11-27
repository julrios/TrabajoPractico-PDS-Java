package com.hospital.notification;

public class NotificadorSMS implements INotificador {
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
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
