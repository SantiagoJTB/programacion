package ies.puerto.personaAlumno;

public class Alumno extends Persona {
    static Persona persona1;
    static Persona persona2  = new Persona("Santi", "12345678A", 25);

    public static void main(String[] args) {
        persona1 = new Persona(establecerDatosStr(),establecerDatosStr(),establecerDatosInt());
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}
