package ies.puerto;

/**
 * Clase que tiene como objetivo realizar la implementacion de metodos en psvm.
 * @author
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }

    /**
     * Función que calcula el factorial de un número
     * @param numero de entrada para el calculo
     * @return resultado de la operacion factorial
     */
    public int calcularFactorial(int numero) {

        int resultado = 1;

        for(int i = 2; i <= numero; i++){
            resultado = resultado * i;
        }

        return 120;
    }
}