package entity;

import notification.GestorNotificaciones;
import java.util.Date;

public class Turno {
    private TipoTurno tipo;
    private Date fecha;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialidad;
    private GestorNotificaciones gestorNotificaciones;

    public Turno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico, Especialidad especialidad, GestorNotificaciones gestorNotificaciones) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
        this.especialidad = especialidad;
        this.gestorNotificaciones = gestorNotificaciones;
    }

    public void cancelar() {
        System.out.println("El turno ha sido cancelado.");
        gestorNotificaciones.notificarCambio(paciente, "Turno cancelado.");
    }
}
