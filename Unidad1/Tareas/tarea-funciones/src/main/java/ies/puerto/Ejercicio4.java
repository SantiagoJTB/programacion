package ies.puerto;

public class Ejercicio4 {

        public int numeroMayor(int numero1,int numero2,int numero3) {

            int resultado = numero2;

            if(numero1>numero2) {
                resultado = numero1;
            }else if(numero2>numero3) {
                resultado = numero3;
            }

            return resultado;
    }
}