package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseInputMismatchException {
    public static void main(String[] args) {

        try{
            int a = introducirValor();
            int b = introducirValor();
            int c = a*b;
            System.out.println(c);
        }catch (InputMismatchException e){
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
