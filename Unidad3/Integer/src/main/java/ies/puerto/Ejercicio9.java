package ies.puerto;

import java.util.Scanner;

/**
 Crea un programa que genere un número entero aleatorio
 en un rango específico utilizando métodos de la clase Integer.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingresa el número máximo:");
        int max = ingresarInt();
        System.out.println("Ingresa el número mínimo:");
        int min = ingresarInt();
        System.out.println(aleatorio(max, min));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static int aleatorio(int max, int min){
        return (int) (Math.random() * (max- min + 1)) + min;
    }
}
