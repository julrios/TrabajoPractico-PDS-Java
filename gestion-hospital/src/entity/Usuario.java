package entity;

import interfaces.Observer;

public abstract class Usuario implements Observer {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void notificarCambio(String mensaje) {
        System.out.println("Usuario notificado: " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Actualización para " + nombre + ": " + mensaje);
    }
}
