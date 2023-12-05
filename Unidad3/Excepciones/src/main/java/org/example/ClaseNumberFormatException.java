package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Crea un programa que solicite al usuario ingresar un número
 * como texto y luego intente convertirlo a un entero.
 * Maneja la excepción NumberFormatException si el usuario
 * ingresa algo que no es un número.
 */
public class ClaseNumberFormatException {
    public static void main(String[] args) {
        String valor = introducirValor();
        try{
            int convertir = parseInt(valor);
            System.out.println(convertir);
        }catch(NumberFormatException e){
            System.out.println("Error");
        }
    }
    public static String introducirValor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor:");
        String valor = sc.nextLine();
        return valor;
    }
}
