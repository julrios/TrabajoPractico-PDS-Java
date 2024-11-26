package entity;

import java.util.Date;

public class Turno {
    private TipoTurno tipo;
    private Date fecha;
    private Paciente paciente;
    private Medico medico;

    public Turno(TipoTurno tipo, Date fecha, Paciente paciente, Medico medico) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void cancelar() {
        System.out.println("El turno ha sido cancelado.");
    }
}
