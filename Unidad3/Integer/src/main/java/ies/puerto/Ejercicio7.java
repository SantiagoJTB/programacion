package ies.puerto;

import java.util.Scanner;

/**
 Desarrolla un programa que convierta un número entero
 a su representación binaria utilizando métodos de la clase Integer.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = ingresarInt();
        System.out.println(binario(numero));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static String binario(int numero){
        return Integer.toBinaryString(numero);
    }
}
