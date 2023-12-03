package org.example;

/**
 * Escribe un programa que busque el número 7 en un array, utilizando break.
 */
public class EjercicioBreak3 {
    public static void main(String[] args) {
        int[] array = {1,7,3,4,5,6,7};
        for(int i = 0; i < array.length; i++){
            if(array[i]==7){
                System.out.println("Encontrado en la posicion: "+(i+1));
                break;
            }
        }
    }
}
