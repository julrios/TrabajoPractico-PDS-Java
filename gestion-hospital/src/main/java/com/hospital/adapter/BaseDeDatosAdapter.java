package com.hospital.adapter;

import java.util.List;

public class BaseDeDatosAdapter {

    public void guardarPaciente(Paciente paciente) {
        System.out.println("Paciente guardado en la base de datos.");
    }

    public void guardarTurno(Turno turno) {
        System.out.println("Turno guardado en la base de datos.");
    }

    public List<Turno> obtenerTurnosPorMedico(Medico medico) {
        System.out.println("Obteniendo turnos para el médico...");
        return List.of(); // Simulación
    }
}
