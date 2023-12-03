package ies.puerto;

import java.util.Scanner;

/**
 Desarrolla un programa que elimine los espacios en blanco al principio y al final de una cadena de texto.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = elegirCadena();
        convertirCadena(cadena);
    }
    public static String elegirCadena () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
        String cadena = sc.nextLine();
        return cadena;
    }
    public static void convertirCadena(String a){
        System.out.println(a.trim());
    }
}
