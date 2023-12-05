package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Escribe un programa que cuente el número de palabras en formato
 Camel Case (palabras concatenadas sin espacios) en una cadena.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        String frase = "EstoEsUnaFrase";
        String regex = "[A-Z]+";

        Pattern pattern = Pattern.compile(frase);
        Matcher matcher = pattern.matcher(regex);

        System.out.println("En la frase hay "+contador(frase,regex)+" palabras.");

    }
    public static void contador(String frase, String regex){
        Pattern pattern = Pattern.compile(frase);
        Matcher matcher = pattern.matcher(regex);

        int contador = 0;
        if(matcher.matches()){
            contador++;
        }
    }
}
