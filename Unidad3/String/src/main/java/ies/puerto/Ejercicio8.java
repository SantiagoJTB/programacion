package ies.puerto;

import java.util.Scanner;

/**
 Implementa un programa que convierta una cadena de texto a minúsculas y otra a mayúsculas.
 */
public class Ejercicio8 {
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
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

    }
}
