package com.hospital.controller;

import java.util.List;

public class TurnoController {

    public List<Turno> listarTurnos(Medico medico) {
        return medico.visualizarTurnos();
    }

    public void asignarEspecialidad(Medico medico, Especialidad especialidad) {
        medico.agregarEspecialidad(especialidad);
        System.out.println("Especialidad asignada al médico.");
    }
}
