package com.hospital.state;

import entity.Paciente;

public class EnTratamiento implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente " + paciente.getNombre() + " está en tratamiento.");
    }
}
