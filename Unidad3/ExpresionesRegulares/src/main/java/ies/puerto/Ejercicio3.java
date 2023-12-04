package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Implementa un validador que verifique si una cadena sigue el formato de fecha común (por ejemplo, DD/MM/AAAA).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String fecha = "10-10-1900";
        String regex = "^([0-9]{2}\\/[0-9]{2}\\/[0-9]{4})$";

        Pattern pattern = Pattern.compile(fecha);
        Matcher matcher = pattern.matcher(regex);

        if(matcher.matches()){
            System.out.println("Fecha valida.");
        }else{
            System.out.println("Fecha invalida.");
        }
    }
}
