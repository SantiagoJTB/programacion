package es.iespuerto;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");

        int n = sc.nextInt();

            int c = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {

                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();
            }
        }
    }
