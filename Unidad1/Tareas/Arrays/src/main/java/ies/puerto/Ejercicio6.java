package ies.puerto;

public class Ejercicio6 {
    public static void main(String[] args) {
        matrizTraspuesta();
    }

    public static void matrizTraspuesta(){
                int[][] matriz = new int[3][3];

        int contador = 1;

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = contador;
                        contador++;
                    }
                }

                int[][] matrizTemporal = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < matriz.length;i++){
                    for (int j = 0; j < matriz[i].length; j++) {
                    matrizTemporal[j][i]=matriz[i][j];
                    }
                        }

                    System.out.println();

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matrizTemporal[i][j] + " ");
                    }
                    System.out.println();
                }
            }
}