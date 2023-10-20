package ies.puerto;

/**
 * Clase que tiene como objetivo realizar calculo de factorial
 * @author santi
 */
public class CalculoFactorial {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando el factorial de "+numero+", resultado: "+calculoFactorial(numero));
    }
    /**
     * Método que realiza el cálculo del factorial
     * @param numero Valor sobre el que se realiza el calculo
     * @return factorial del número dado
     */
    public static int calculoFactorial(int numero){
        int resultado = 1;

        for(int i = 2; i<=numero ; i++){
            resultado= resultado*i;
        }

        return resultado;
    }
}