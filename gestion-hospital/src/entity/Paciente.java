package entity;

import state.IEstadoPaciente;

import java.util.Date;

public class Paciente extends Usuario {
    private String documento;
    private String historiaClinica;
    private IEstadoPaciente estado;

    public Paciente(String nombre, String email, String documento, IEstadoPaciente estado) {
        super(nombre, email);
        this.documento = documento;
        this.estado = estado;
        this.historiaClinica = "";
    }

    public void solicitarTurno(String especialidad, Date disponibilidad) {
        System.out.println("Turno solicitado para la especialidad: " + especialidad + " en la fecha: " + disponibilidad);
    }

    public void cambiarEstado(IEstadoPaciente nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void actualizarHistoriaClinica(String historia) {
        this.historiaClinica += historia + "\n";
    }
}
