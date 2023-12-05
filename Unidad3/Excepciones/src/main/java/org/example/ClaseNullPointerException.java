package org.example;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null.
 * Por ejemplo un String. Maneja la excepción NullPointerException.
 */
public class ClaseNullPointerException {
    public static void main(String[] args) {
        String cadena = null;

        try {
            int longitud = cadena.length();
            System.out.println("La longitud de la cadena es: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una NullPointerException: " + e.getMessage());
        }
    }
    }

