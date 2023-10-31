package ies.puerto;

import java.util.Arrays;

public class Ejercicio8 {

        public static void main(String[] args) {
            int[] arrayConDuplicados = {1, 2, 3, 2, 4, 5, 4, 6, 7, 1};
            System.out.println("Array con elementos duplicados:");
            System.out.println(Arrays.toString(arrayConDuplicados));

            int[] arraySinDuplicados = eliminarDuplicados(arrayConDuplicados);

            System.out.println("Array sin elementos duplicados:");
            System.out.println(Arrays.toString(arraySinDuplicados));
        }

        public static int[] eliminarDuplicados(int[] arrayConDuplicados) {
            int[] arraySinDuplicados = new int[arrayConDuplicados.length];
            int indice = 0;

            for (int i = 0; i < arrayConDuplicados.length; i++) {
                boolean esDuplicado = false;

                for (int j = 0; j < indice; j++) {
                    if (arrayConDuplicados[i] == arraySinDuplicados[j]) {
                        esDuplicado = true;
                        break;
                    }
                }

                if (!esDuplicado) {
                    arraySinDuplicados[indice] = arrayConDuplicados[i];
                    indice++;
                }
            }

            return Arrays.copyOf(arraySinDuplicados, indice);
        }
    }

