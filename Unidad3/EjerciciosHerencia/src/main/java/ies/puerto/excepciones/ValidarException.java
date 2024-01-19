package ies.puerto.excepciones;

import ies.puerto.personaEstudiante.Autentificacion;

import javax.swing.*;

public class ValidarException extends Exception{
    String password;
    public ValidarException(){}
    public ValidarException(String password){
        this.password = password;
    }

}
