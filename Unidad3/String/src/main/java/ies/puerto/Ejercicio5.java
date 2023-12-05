package ies.puerto;

import java.util.Scanner;

/**
 Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Escribe una cadena:");
        String cadena = elegirCadena();
        System.out.println("Elige una letra que quieras cambiar:");
        char letra = elegirLetra();
        System.out.println("Elige una letra que sustituya:");
        char nuevaLetra = elegirLetra();
        System.out.println(reemplazar(cadena,letra,nuevaLetra));

    }

    public static char[] reemplazar(String a, char b, char c) {
        char[] cadenaNueva = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (cadenaNueva[i] == b) {
                cadenaNueva[i] = c;
            }
        }        return cadenaNueva;
    }
        public static char elegirLetra () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una letra:");
            char letra = sc.next().charAt(0);
            return letra;
        }
    public static String elegirCadena () {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        return cadena;
    }
}

