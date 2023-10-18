package es.iespuerto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición que deseas conocer: ");

        int n = sc.nextInt();
        int num1=0, num2=1, suma=1;

        for (int i = 1; i < n; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        System.out.println(suma);

    }
}
