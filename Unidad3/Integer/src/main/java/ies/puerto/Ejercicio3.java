package ies.puerto;

import java.util.Scanner;

/**
 Desarrolla un programa que determine si un número
 entero es primo o no utilizando los métodos de la clase Integer.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = ingresarInt();
        System.out.println(resultado(esPrimo(numero)));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String resultado(boolean a){
        return a ? "El número es primo" : "El número no es primo.";
    }
}