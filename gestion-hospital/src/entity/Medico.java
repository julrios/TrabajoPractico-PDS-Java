package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Usuario {
    private List<Especialidad> especialidades;
    private List<Date> horariosDisponibles;

    public Medico(String nombre, String email) {
        super(nombre, email);
        this.especialidades = new ArrayList<>();
        this.horariosDisponibles = new ArrayList<>();
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    public void actualizarDisponibilidad(Date horario) {
        horariosDisponibles.add(horario);
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public List<Date> getHorariosDisponibles() {
        return horariosDisponibles;
    }
}
