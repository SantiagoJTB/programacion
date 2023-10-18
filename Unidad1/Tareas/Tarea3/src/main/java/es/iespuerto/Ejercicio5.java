package es.iespuerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición que deseas conocer: ");

        int n = sc.nextInt() + 1;
        int num1=0, num2=1, suma=1;

        for (int i = 1; i < n; i++) {
            System.out.println(suma);

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }

    }
}
