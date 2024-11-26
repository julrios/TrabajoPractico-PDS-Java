package factory;

import entity.*;

import java.util.Date;

public class TurnoFactory {
    public Turno crearTurno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico) {
        return new Turno(tipo, fecha, paciente, medico);
    }
}
