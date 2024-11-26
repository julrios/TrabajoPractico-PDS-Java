package notification;

import entity.Usuario;

public class SistemaNotificacion {
    private INotificador notificador;

    public SistemaNotificacion(INotificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacion(Usuario usuario, String mensaje) {
        notificador.enviarNotificacion(usuario.getEmail(), mensaje);
        System.out.println("Notificación enviada a " + usuario.getNombre());
    }
}
