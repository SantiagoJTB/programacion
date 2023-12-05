package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Crea un método que acepte un número y maneja la
 * excepción IllegalArgumentException si el número es negativo.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseIllegalArgumentException {
    public static void main(String[] args) {

        try {
            int valor = introducirValor();
            System.out.println(valor);
        } catch (InputMismatchException e) {
            System.out.println("Error: La entrada debe ser un número entero");
        }
    }

    public static int introducirValor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor:");
        int valor = sc.nextInt();
        return valor;
    }
}

