package com.hospital.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Usuario {
    private List<Especialidad> especialidades;
    private List<Date> horariosDisponibles;
    private List<Turno> turnosAsignados;

    public Medico(String nombre, String email) {
        super(nombre, email);
        this.especialidades = new ArrayList<>();
        this.horariosDisponibles = new ArrayList<>();
        this.turnosAsignados = new ArrayList<>();
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    public void actualizarDisponibilidad(Date horario) {
        horariosDisponibles.add(horario);
    }

    public List<Turno> visualizarTurnos() {
        return turnosAsignados;
    }
}
