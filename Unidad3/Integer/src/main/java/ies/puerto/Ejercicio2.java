package ies.puerto;

import java.util.Objects;
import java.util.Scanner;

/**
 Escribe un programa que convierta un número entero en una cadena
 de texto y viceversa utilizando los métodos de la clase Integer.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = sc.nextInt();
        System.out.println("Integer convertido en: "+convertidorString(numero).getClass().getSimpleName());
        sc.nextLine();
        System.out.println("Ingresa un número:");
        String numeroStr = sc.nextLine();
        System.out.println("String convertido en: "+convertidorInt(numeroStr).getClass().getSimpleName());

    }

    public static String convertidorString(int numero){
        return Integer.toString(numero);
    }
    public static Integer convertidorInt(String numero){
        return Integer.parseInt(numero);
    }
}
