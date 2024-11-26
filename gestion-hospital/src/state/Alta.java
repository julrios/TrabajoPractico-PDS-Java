package state;

import entity.Paciente;

public class Alta implements IEstadoPaciente {
    @Override
    public void realizarAccion(Paciente paciente) {
        System.out.println("El paciente ha recibido el alta.");
    }
}
