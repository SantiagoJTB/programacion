package org.example;

/**
 * Escribe un programa que encuentre el primer número divisible
 * por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class EjercicioBreak1 {
    public static void main(String[] args) {
        numeroDivisble();
    }
    public static void numeroDivisble(){
        for (int i = 1; i < 100; i++){
            if(i % 7 == 0 && i % 5 == 0){
                System.out.println("El número: "+i+" es multiplo de 5 y 7");
                break;
            }
        }
    }
}