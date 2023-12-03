package org.example;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos
 * números e imprima el resultado de la división.
 * Asegúrate de manejar la excepción ArithmeticException
 * si el segundo número ingresado es 0.
 */
public class ClaseArithmeticException extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = introducirValor();
        int numero2 = introducirValor();
        try{
        int division = numero1/numero2;
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Error");
        }
    }
    public static int introducirValor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor:");
        int valor = sc.nextInt();
        return valor;
    }
}

