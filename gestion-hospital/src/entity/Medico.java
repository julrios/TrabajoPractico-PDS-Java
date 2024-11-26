package entity;

import notification.GestorNotificaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Usuario {
    private List<Especialidad> especialidades;
    private List<Date> horariosDisponibles;
    private List<Turno> turnosAsignados; // Lista de turnos asignados al médico
    private GestorNotificaciones gestorNotificaciones;

    public Medico(String nombre, String email, GestorNotificaciones gestorNotificaciones) {
        super(nombre, email);
        this.especialidades = new ArrayList<>();
        this.horariosDisponibles = new ArrayList<>();
        this.turnosAsignados = new ArrayList<>();
        this.gestorNotificaciones = gestorNotificaciones;
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    public void actualizarDisponibilidad(Date horario) {
        horariosDisponibles.add(horario);
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public List<Date> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void asignarTurno(Turno turno) {
        turnosAsignados.add(turno);
    }

    public List<Turno> visualizarTurnos() {
        return turnosAsignados; // Devuelve la lista de turnos asignados
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Médico notificado: " + mensaje);
    }
}
