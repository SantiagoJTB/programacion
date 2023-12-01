package ies.puerto;

/**
 Implementa un programa que invierta una cadena de texto dada.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "Esto es una cadena.";
        System.out.println(invertirCadena(cadena));
    }

    public static String invertirCadena(String a){
        String cadenaInvertida= "";
        for( int i = a.length(); i != 0; i--){
            cadenaInvertida = a.concat(String.valueOf(i));
        } return cadenaInvertida;
    }
}
