package controller;

import entity.Especialidad;
import entity.Medico;

import java.util.List;

public class MedicoController {
    public void listarTurnos(Medico medico) {
        List<?> turnos = medico.visualizarTurnos();
        System.out.println("Turnos asignados al médico:");
        turnos.forEach(System.out::println);
    }

    public void asignarEspecialidad(Medico medico, Especialidad especialidad) {
        medico.agregarEspecialidad(especialidad);
        System.out.println("Especialidad asignada al médico.");
    }
}
