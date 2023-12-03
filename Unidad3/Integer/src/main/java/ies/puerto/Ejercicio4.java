package ies.puerto;

import java.util.Scanner;

/**
 Implementa un programa que calcule y muestre
 la suma de los dígitos de un número entero.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = ingresarInt();
        System.out.println(suma(numero));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        return numero;
    }
    public static int suma(int numero){
        int suma = 0;
        char[] numeroStr = Integer.toString(numero).toCharArray();
        int contador = numeroStr.length;
        for(int i = 0; i < contador; i++){
            suma += Integer.parseInt(String.valueOf(numeroStr[i]));
        }
        return suma;
    }
}
