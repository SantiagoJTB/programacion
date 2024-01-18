package ies.puerto.personaEstudiante;

import ies.puerto.excepciones.ValidarException;

import java.util.Scanner;

public class Autentificacion extends Persona{
    String password;
    public Autentificacion(){}
    public Autentificacion(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autentificar() throws ValidarException {
        password = getPassword();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la contraseña: password");
        String passwordMetodo = sc.nextLine();

        if(password.equals(passwordMetodo)){
            System.out.println("Contraseña correcta.");
            return true;
        }else{
           throw new ValidarException();
        }
    }
}
