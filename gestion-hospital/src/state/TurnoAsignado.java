package state;

import entity.Paciente;

public class TurnoAsignado implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente tiene un turno asignado.");
    }
}
