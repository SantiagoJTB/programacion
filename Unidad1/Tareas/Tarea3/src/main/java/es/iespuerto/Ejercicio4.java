package es.iespuerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int falta,numeroInvertido,resto;

        while(numero <= 0);
        falta = numero;
        numeroInvertido = 0;
        resto = 0;

        while(falta !=0 )
        {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }

        if(numeroInvertido == numero)
            System.out.println("El numero "+numero+ " es palindromo");
        else
            System.out.println("El numero " +numero+ " no es palindromo");
    }
}
