package ies.puerto;

import java.util.Scanner;

/**
 Escribe un programa que determine si un número entero es positivo,
 negativo o cero utilizando métodos de la clase Integer.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        double numero = ingresarInt();
        System.out.println(signoNumero(numero));
    }
    public static double ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        double numero = sc.nextDouble();
        return numero;
    }
    public static String signoNumero(double numero){
        String a = "";
        if(numero == 0){
            a = "Es cero.";
        }else if(numero < 0){
            a = "Es negativo.";
        }else{
            a = "Es positivo.";
        }
        return a;
    }
}

