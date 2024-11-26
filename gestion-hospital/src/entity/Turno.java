package entity;

import interfaces.Observer;
import interfaces.Sujeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turno implements Sujeto {
    private TipoTurno tipo;
    private Date fecha;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialidad;
    private List<Observer> observadores;

    public Turno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico, Especialidad especialidad) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
        this.especialidad = especialidad;
        this.observadores = new ArrayList<>();
    }

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

    public void cancelar() {
        System.out.println("El turno ha sido cancelado.");
        notificarObservadores("El turno fue cancelado.");
    }
}
