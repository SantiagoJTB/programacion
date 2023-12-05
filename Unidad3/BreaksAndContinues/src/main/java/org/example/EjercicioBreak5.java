package org.example;

/**
 * Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break.
 */
public class EjercicioBreak5 {
    public static void main(String[] args) {
        for(int i = 31; true; i++){
            if(i%5==0){
                System.out.println("Encontrado: "+i);
                break;
            }
        }
    }
}
