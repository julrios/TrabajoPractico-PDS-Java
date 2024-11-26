package factory;

import entity.*;

import java.util.Date;

public class TurnoFactory {
    public Turno crearTurno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico, Especialidad especialidad) {
        return new Turno(tipo, fecha, paciente, medico, especialidad, null);
    }
}
