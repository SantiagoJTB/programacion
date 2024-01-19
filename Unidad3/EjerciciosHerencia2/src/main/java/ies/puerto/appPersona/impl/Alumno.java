package ies.puerto.appPersona.impl;

import ies.puerto.appPersona.abstracto.PersonaAbstract;

import java.util.Scanner;

public class Alumno extends PersonaAbstract {
    String nivel = obtenerNivel();
    public Alumno() throws Exception {
    }

    public Alumno(String nombre) throws Exception {
        super(nombre);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String obtenerNivel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nivel del alumno:");
        return sc.nextLine();
    }
    public String estudiar(){
        return "Estoy estudiando!";
    }
    @Override
    public String toString(){
        return "Soy el Alumno "+getNombre()+", mi edad es "+getEdad()+" es decir nací el: "+getFechaNacimiento()+", y mi nivel de estudios es: "+getNivel();
    }
    @Override
    public String fechaNacimiento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de nacimiento del alumno: dd/MM/yyyy");
        return sc.nextLine();
    }

}
