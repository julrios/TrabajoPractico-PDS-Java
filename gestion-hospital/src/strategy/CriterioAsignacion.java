package strategy;

import entity.*;

import java.util.Date;

public class CriterioAsignacion {
    public Turno asignarTurno(Paciente paciente, Especialidad especialidad, Date disponibilidad) {
        System.out.println("Asignando turno al paciente...");
        // Lógica de asignación simulada
        return new Turno(TipoTurno.REGULAR, disponibilidad, paciente, null);
    }
}
