package ies.puerto;

/**
 Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "Está el pingüino Emilio gritando: ¡ADIÓS!.";
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
        System.out.println(contadorVocales(vocales,cadena));
    }
    public static int contadorVocales(String a, String b){
        int contador = 0;

        for ( int i = 0; i < a.length(); i++){
            char vocal = a.charAt(i);
            for ( int j = 0; j < b.length(); j++) {
                char letra = b.charAt(j);

                if (vocal == letra) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
