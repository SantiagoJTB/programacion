package ies.puerto;

public class Ejercicio4 {
    /**
     * recorrer un rango de números (1-1000)
     * para un número comprobar si es un número Amstrong
     * si es: imprime en pantalla
     * si no: sigue adelante
     */

    /**
     * función que verifica si un número es Amstrong
     * @param numero para realizar la verificación
     * @return boolean true/false con el resultado
     */
    public boolean verificarAmstrong(int numero){
        boolean resultado = false;
        int digitos = 0;
        int calcularDigitos = numero;

        while (calcularDigitos > 0){

            calcularDigitos = calcularDigitos/10;
            digitos++;
        }

        while (calcularDigitos > 0){

            calcularDigitos = calcularDigitos%10;
            digitos++;
        }

        return resultado;
    }

}