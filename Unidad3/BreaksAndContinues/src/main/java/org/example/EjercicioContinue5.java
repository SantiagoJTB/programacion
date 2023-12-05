package org.example;

/**
 * Escribe un programa que imprima todos los números
 * positivos en un array, usando continue para omitir los números negativos.
 */
public class EjercicioContinue5 {
    public static void main(String[] args) {
        int[] numeros = {-2, 5, -8, 10, 15, -3, 7};
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]<0){
                continue;
            }
            System.out.println(numeros[i]);
        }
    }
}
