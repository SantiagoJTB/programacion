package org.example;

/**
 * Escribe un programa que imprima los números del 1 al 20,
 * pero omita la impresión de los números que son múltiplos de 3 utilizando continue.
 */
public class EjercicioContinue1 {
    public static void main(String[] args) {
        for(int i = 0; i<20; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
