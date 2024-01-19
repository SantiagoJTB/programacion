package ies.puerto.appPersona.impl;

import ies.puerto.appPersona.abstracto.PersonaAbstract;
import ies.puerto.appPersona.interfaz.Trabajador;

import java.util.Scanner;

public class Empleado extends PersonaAbstract implements Trabajador {
    String trabajo = puesto();
    float salario = salario(trabajo);


    public Empleado() throws Exception {}

    public Empleado(String nombre) throws Exception {
        super(nombre);
    }
    public Empleado(String trabajo, String nombre, String fechaNacimiento, int edad, float salario) throws Exception {
        super(nombre,fechaNacimiento, edad);
        this.salario = salario;
        this.trabajo = trabajo;
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String trabajar() {
        return "Soy un Trabajador Empleado";
    }
    @Override
    public String toString(){
        return "Me llamo "+getNombre()+" soy un "+getTrabajo()+", mi salario es: "+getSalario()+" y mi edad es "+getEdad()+" ya que nací el:"+getFechaNacimiento();
    }

    public String puesto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu puesto: Jefe, Encargado o Explotado");
        return sc.nextLine();
    }
    public float salario(String trabajo) throws Exception {
        float salario = 0;
        if(trabajo.equals("Jefe")){
             salario = 2000.40f;
        }else if(trabajo.equals("Encargado")){
             salario = 1500.68f;
        }else if(trabajo.equals("Explotado")){
             salario = 1000.23f;
        }else{
            String IllegalArgumentException = "Introduce un puesto valido.";
            throw new Exception(IllegalArgumentException);}

        return salario;
    }

    @Override
    public String fechaNacimiento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de nacimiento del empleado: dd/MM/yyyy");
        return sc.nextLine();
    }
}
