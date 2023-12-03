package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros como entrada y muestre
 * el máximo común divisor utilizando métodos de la clase Integer.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingresa el primer número:");
        int n1 = ingresarInt();
        System.out.println("Ingresa el segundo número:");
        int n2 = ingresarInt();
        System.out.println(mcd(n1,n2));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static int mcd(int numero1, int numero2){
        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        return numero1;
    }
}
