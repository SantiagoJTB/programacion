package ies.puerto;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
       edad = 19;
       nombre = "Paco";

       Persona persona = new Persona(nombre,edad);
        System.out.println("Es mayor de edad: "+persona.mayorEdad());
    }
    public static class Persona {
        static String nombre;
        static int edad;
        public Persona(){}
        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        public static boolean mayorEdad(){
            if(edad>18){
                return true;
            }
            return false;
        }
    }
}