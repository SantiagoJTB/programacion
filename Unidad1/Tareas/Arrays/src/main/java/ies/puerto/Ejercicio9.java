package ies.puerto;

import java.util.Arrays;

public class Ejercicio9 {

        public static void main(String[] args) {
            int[] array1 = {1, 3, 5, 7, 9};
            int[] array2 = {2, 4, 6, 8, 10};

            int[] arrayCombinado = combinarArraysOrdenados(array1, array2);

            System.out.println("Arrays combinados y ordenados:");
            System.out.println(Arrays.toString(arrayCombinado));
        }

        public static int[] combinarArraysOrdenados(int[] array1, int[] array2) {
            int[] arrayCombinado = new int[array1.length + array2.length];

            int index1 = 0, index2 = 0, indexResult = 0;

            while (index1 < array1.length && index2 < array2.length) {
                if (array1[index1] < array2[index2]) {
                    arrayCombinado[indexResult] = array1[index1];
                    index1++;
                } else {
                    arrayCombinado[indexResult] = array2[index2];
                    index2++;
                }
                indexResult++;
            }

            while (index1 < array1.length) {
                arrayCombinado[indexResult] = array1[index1];
                index1++;
                indexResult++;
            }

            while (index2 < array2.length) {
                arrayCombinado[indexResult] = array2[index2];
                index2++;
                indexResult++;
            }

            return arrayCombinado;
        }
    }


