package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Desarrolla un programa que extraiga todos los números de teléfono
 válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada. (Convina lo aprendido).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String numero = "+22-222-22-22-22";
        String regex = "^\\+([0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}-[0-9]{2})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numero);

        if(matcher.matches()){
            System.out.println("Número valido.");
        }else{
            System.out.println("número invalido.");
        }
    }
}
