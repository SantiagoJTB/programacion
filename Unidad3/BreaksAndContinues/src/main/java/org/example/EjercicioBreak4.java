package org.example;

/**
 * Escribe un programa que encuentre el primer número negativo en un array, utilizando break.
 */
public class EjercicioBreak4 {
    public static void main(String[] args) {
        int[] array = {1,2,-1,4};

        for(int i = 0; i < array.length; i++){
            if(array[i]<0){
                System.out.println("Encontrado en la posicion: "+(i+1));
                break;
            }
        }
    }
}
