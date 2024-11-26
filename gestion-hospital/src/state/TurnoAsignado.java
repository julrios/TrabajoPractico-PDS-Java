package state;

import entity.Paciente;

public class TurnoAsignado implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente " + paciente.getNombre() + " tiene un turno asignado.");
    }
}
