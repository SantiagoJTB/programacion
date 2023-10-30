package ies.puerto;

public class Ejercicio1 {

    public static int sumar() {
        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
        public static void main(String[] args) {
            System.out.println("La suma de elementos es: "+sumar());
        }
    }
