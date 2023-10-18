package es.iespuerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        System.out.println("introduce un número:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("LA TABLA DEL "+n );

        for (int i = 0; i < 10; i++){
            int j = i*n;
            System.out.println(i +" * "+ n +" = "+ j);
        }
    }
}
