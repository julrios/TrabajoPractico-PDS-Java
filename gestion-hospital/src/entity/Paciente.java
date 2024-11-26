package entity;

import state.IEstadoPaciente;
import notification.GestorNotificaciones;
import java.util.Date;

public class Paciente extends Usuario {
    private String documento;
    private String historiaClinica;
    private IEstadoPaciente estado;
    private GestorNotificaciones gestorNotificaciones;

    public Paciente(String nombre, String email, String documento, IEstadoPaciente estado, GestorNotificaciones gestorNotificaciones) {
        super(nombre, email);
        this.documento = documento;
        this.estado = estado;
        this.gestorNotificaciones = gestorNotificaciones;
        this.historiaClinica = "";
    }

    public void solicitarTurno(String especialidad, Date disponibilidad) {
        System.out.println("Turno solicitado para especialidad: " + especialidad + " en fecha: " + disponibilidad);
    }

    public void cambiarEstado(IEstadoPaciente nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void realizarAccion() {
        estado.realizarAccion(this);
    }

    public void actualizarHistoriaClinica(String historia) {
        this.historiaClinica += historia + "\n";
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Paciente actualizado con mensaje: " + mensaje);
    }
}
