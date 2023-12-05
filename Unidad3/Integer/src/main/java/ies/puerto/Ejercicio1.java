package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como
 * entrada y verifique si es par o impar utilizando los métodos
 * de la clase Integer. Controla las exeption que pudiera generar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try{
            programa();
        }catch (IllegalArgumentException e){
            System.out.println("El 0 no es un número valido.");
            programa();
        }
    }
    public static void programa(){
        int numero = ingresarInt();
        System.out.println(resultado(parImpar(numero)));
    }
    public static int ingresarInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        if(numero == 0) {
            throw new IllegalArgumentException("No se puede introducir el número 0.");
        }
        return numero;
    }

    public static boolean parImpar(int numero) {
        return numero % 2 == 0;
    }
    public static String resultado(boolean resultado) {
        return resultado ? "El número es par." : "El número es impar.";
        }
}

