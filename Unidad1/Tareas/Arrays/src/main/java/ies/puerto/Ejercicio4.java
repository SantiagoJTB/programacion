package ies.puerto;

public class Ejercicio4 {
    public static void mostrarPares() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Los números pares son: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        mostrarPares();
    }
}