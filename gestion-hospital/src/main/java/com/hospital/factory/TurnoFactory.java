package com.hospital.factory;

import com.hospital.entity.Medico;
import com.hospital.entity.Paciente;
import com.hospital.entity.TipoTurno;
import com.hospital.entity.Turno;


import java.util.Date;

public class TurnoFactory {
    public Turno crearTurno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico) {
        return new Turno(tipo, fecha, paciente, medico);
    }
}
