package ies.puerto.personaAlumno;

import java.util.Scanner;

/**
 *
 Crea una clase Persona con atributos como nombre, edad y dni. Añade métodos para obtener y establecer los valores de los atributos.
 Crea una clase Alumno que haga uso (extends) de la clase Alumno.

 */
public class Persona {
    private  String dni;
    private String nombre;
    private  int edad;

    public Persona(){}
    public Persona(String dni, String nombre, int edad){
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    public  String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
    public static void obtenerDatos(Persona persona){
        System.out.println("El nombre es:"+getNombre()+", el dni es:"+getDni()+", la edad es:"+getEdad());
    }
     **/

    public void mostrarDatos(){
        System.out.println("El nombre es:"+getNombre()+", el dni es:"+getDni()+", la edad es:"+getEdad());
    }
    public static String establecerDatosStr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu String:");
        return sc.nextLine();
    }
    public static int establecerDatosInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu Int:");
        return sc.nextInt();
    }
}