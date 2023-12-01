package ies.puerto;

import java.util.Scanner;

/**
 Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena específica.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = elegirCadena();
        String cadena2 = elegirCadena();
        elegirOpcion(cadena,cadena2);
    }
    public static void elegirOpcion(String a, String b){
        System.out.println("¿Quieres buscar al inicio o al final? 1.Inicio 2.Final");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: startsWith(a,b);
                break;
            case 2: endsWith(a,b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }
    }
    public static boolean startsWith(String a, String b){
        if(a.startsWith(b)){
            System.out.println("Exito");
            return true;
        }
        return false;
    }
    public static boolean endsWith(String a, String b){
        if(a.endsWith(b)){
            System.out.println("Exito");
            return true;
        }
        return false;
    }
    public static String elegirCadena () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
        String cadena = sc.nextLine();
        return cadena;
    }
}
