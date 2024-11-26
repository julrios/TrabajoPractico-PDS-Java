package controller;

import entity.Paciente;
import state.IEstadoPaciente;

public class PacienteController {
    public Paciente crearPaciente(String nombre, String email, String documento) {
        System.out.println("Creando paciente...");
        return new Paciente(nombre, email, documento, null, null);
    }

    public void actualizarEstado(Paciente paciente, IEstadoPaciente nuevoEstado) {
        paciente.cambiarEstado(nuevoEstado);
        System.out.println("Estado del paciente actualizado.");
    }
}
