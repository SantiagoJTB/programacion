package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        ordenarAscendente();
    }
        public static void ordenarAscendente() {
            int[] array = {7, 3, 9, 1, 5};

            Arrays.sort(array);

            System.out.println("Array ordenado en orden ascendente:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }

