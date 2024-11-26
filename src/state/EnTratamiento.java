package state;

import entity.Paciente;

public class EnTratamiento implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente está en tratamiento.");
    }
}
