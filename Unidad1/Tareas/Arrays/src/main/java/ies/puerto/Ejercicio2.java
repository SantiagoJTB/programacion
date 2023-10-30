package ies.puerto;

public class Ejercicio2 {
        public static int media() {
            int[] array = {1, 2, 3, 4, 5};
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
            return suma / array.length+1;
        }
        public static void main(String[] args) {
            System.out.println("La media de los elementos es: "+media());
        }
    }


