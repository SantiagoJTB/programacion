package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el mcd de dos números dados
     * @param a
     * @param b
     * @return mcd de a y b
     */
    public int mcd(int a, int b) {

        boolean coincidencia = false;
        int resultado = 0;
        int mayor = b;

         if (a > b){
             mayor = a;
         }

         int i = mayor/2;
         while((coincidencia == false) && (i > 0)){
             if (a%i == 0){
                coincidencia = true;
                resultado = i;
             }
             i--;
         }

        return resultado;
    }

}