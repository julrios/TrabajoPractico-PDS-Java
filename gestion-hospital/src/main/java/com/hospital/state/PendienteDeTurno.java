package com.hospital.state;

import entity.Paciente;

public class PendienteDeTurno implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente está pendiente de turno.");
    }
}
