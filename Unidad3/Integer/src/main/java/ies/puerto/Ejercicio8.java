package ies.puerto;

import java.util.Scanner;

/**
 Implementa un programa que calcule el factorial
 de un número entero utilizando métodos de la clase Integer.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = ingresarInt();
        System.out.println(factorial(numero));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static int factorial(int numero){
        int suma = 1;
        for (int i = numero; i >= 1; i--){
            suma *= i;
        }
        return suma;
    }
}
