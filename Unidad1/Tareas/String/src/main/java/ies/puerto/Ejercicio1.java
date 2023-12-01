package ies.puerto;

import java.util.Scanner;

/**
 Crea un programa que tome una cadena de texto e imprima su longitud.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una cadena de texto:");
        String cadena = sc.nextLine();
        System.out.println(cadena.length());
    }
}