package ies.puerto;

public class Ejercicio10 {

        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 0, 0},
                    {0, 5, 0},
                    {0, 0, 9}
            };

            boolean esDiagonal = esMatrizDiagonal(matriz);

            if (esDiagonal) {
                System.out.println("La matriz es diagonal.");
            } else {
                System.out.println("La matriz no es diagonal.");
            }
        }

        public static boolean esMatrizDiagonal(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i != j && matriz[i][j] != 0) {
                        return false; // Si un elemento fuera de la diagonal no es cero, la matriz no es diagonal
                    }
                }
            }
            return true; // Todos los elementos fuera de la diagonal son cero
        }
    }

