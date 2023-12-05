package ies.puerto;

/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "Esto es una cadena.";
        imprimirPalabras(cadena);
    }

    public static void imprimirPalabras(String a) {
        for (int j = 0; j < a.length(); j++) {
            if (a.charAt(j) != ' ') {
                System.out.print(a.charAt(j));
            } else {
                System.out.println();
            }
        }
    }
}
