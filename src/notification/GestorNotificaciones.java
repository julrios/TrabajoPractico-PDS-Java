package notification;

import interfaces.Observer;
import interfaces.Sujeto;
import entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones implements Sujeto {
    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (Observer observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void notificarCambio(Usuario usuario, String mensaje) {
        System.out.println("Notificando cambio a " + usuario.getNombre() + ": " + mensaje);
    }
}
