package es.iespuerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 2 números:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("El MCD de " +a+ " y " +b+ " es: ");

        int temporal;

        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        System.out.println(a);
    }
}