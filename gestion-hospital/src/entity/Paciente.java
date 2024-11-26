package entity;

import state.IEstadoPaciente;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario {
    private String documento;
    private String historiaClinica;
    private IEstadoPaciente estado;
    private List<Turno> turnos;

    public Paciente(String nombre, String email, String documento, IEstadoPaciente estado) {
        super(nombre, email);
        this.documento = documento;
        this.estado = estado;
        this.historiaClinica = "";
        this.turnos = new ArrayList<>();
    }

    public void cambiarEstado(IEstadoPaciente nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void realizarAccion() {
        estado.realizarAccion(this);
    }
}
