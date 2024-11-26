package controller;

import entity.*;
import state.IEstadoPaciente;

public class PacienteController {
    public Paciente crearPaciente(String nombre, String documento, String email) {
        System.out.println("Creando paciente...");
        return new Paciente(nombre, email, documento, null);
    }

    public void actualizarEstado(Paciente paciente, IEstadoPaciente nuevoEstado) {
        paciente.cambiarEstado(nuevoEstado);
        System.out.println("Estado del paciente actualizado.");
    }
}
