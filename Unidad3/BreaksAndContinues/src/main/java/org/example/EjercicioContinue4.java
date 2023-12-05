package org.example;

/**
 * Escribe un programa que busque y cuente los números mayores que 50 en un array,
 * usando continue para omitir los números menores o iguales a 50.
 */
public class EjercicioContinue4 {
    public static void main(String[] args) {
        int contador = 0;
        int[] numeros = {40, 60, 30, 80, 50, 45, 70};
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]<=50){
                continue;
            }
            contador++;
        }
        System.out.println(contador);
    }
}
