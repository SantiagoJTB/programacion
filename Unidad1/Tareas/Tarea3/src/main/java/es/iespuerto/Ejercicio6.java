package es.iespuerto;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        for (int i = 0; i<=1000; i++){

            if (i==1000){
                int i1 = i / 1000;

                int i2 = i / 100;
                int i3 = i / 10;
            }
            else if (i<=100){
                int i2 = i / 100;
                int i3 = i / 10;
            }
            else if (i<=10){
                int i3 = i / 10;
            }
        }
    }
}
