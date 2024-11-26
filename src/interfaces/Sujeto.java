package interfaces;

import java.util.List;

public interface Sujeto {
    void agregarObservador(Observer observador);
    void eliminarObservador(Observer observador);
    void notificarObservadores(String mensaje);
}
