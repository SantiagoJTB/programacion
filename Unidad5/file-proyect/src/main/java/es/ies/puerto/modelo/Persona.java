package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClase;

import java.util.Objects;

public class Persona extends UtilidadesClase {
    String nombre;
    int id;
    int edad;
    String email;

    public Persona(){}
    public Persona(int id){
        this.id = id;
    }
    public Persona(int id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Persona persona = (Persona) object;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}';
    }
    public String toCsv(){
        return getId()+","+getNombre()+","+getEdad()+","+getEmail();
    }
}
