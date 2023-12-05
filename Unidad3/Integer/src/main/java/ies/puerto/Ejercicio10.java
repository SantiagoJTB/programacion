package ies.puerto;

import java.util.Scanner;

/**
 Escribe un programa que verifique si una cadena de texto puede
 convertirse en un número entero utilizando métodos de la clase Integer.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        String numero = sc.nextLine();
        convertidorInt(numero);
    }

    public static void convertidorInt(String numero) {
        try {
            int numeroEntero = Integer.parseInt(numero);
            System.out.println("El número ingresado se convirtió a entero: " + numeroEntero);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo convertir a entero. Error: " + e.getMessage());
        }
    }
}
