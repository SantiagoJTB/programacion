package org.example;

/**
 * Escribe un programa que sume todos los números pares
 * del 1 al 10, usando continue para omitir los números impares.
 */
public class EjercicioContinue3 {
    public static void main(String[] args) {
        int suma  = 0;
        for(int i = 0; i<10; i++){
            if(i%2!=0){
                continue;
            }
            suma += i;
        }            System.out.println(suma);

    }
}
