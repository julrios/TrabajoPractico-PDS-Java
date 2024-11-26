package controller;

import entity.*;
import factory.TurnoFactory;

import java.util.Date;

public class TurnoController {
    private TurnoFactory turnoFactory = new TurnoFactory();

    public Turno crearTurno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico, Especialidad especialidad) {
        System.out.println("Creando turno...");
        return turnoFactory.crearTurno(tipo, fecha, paciente, medico, especialidad);
    }

    public void cancelarTurno(Turno turno) {
        turno.cancelar();
        System.out.println("Turno cancelado.");
    }
}