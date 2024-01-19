package ies.puerto.personaEstudiante;

import ies.puerto.excepciones.ValidarException;

public class AppPersonaEstudiante {
    static Estudiante estudiante1;
    static Autentificacion password1 = new Autentificacion("password");

    public static void main(String[] args) throws ValidarException {
        estudiante1 = new Estudiante("Santi", "1234567A",1,10);
        System.out.println(estudiante1);
        System.out.println(estudiante1.saludar());
        password1.autentificar();
    }
}
