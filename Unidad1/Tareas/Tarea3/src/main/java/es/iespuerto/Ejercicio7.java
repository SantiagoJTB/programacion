package es.iespuerto;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");

        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("El día es Lunes");
            break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miercoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sábado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;

            default:
                System.out.println("Introduce un número entre 1 y 7");
        }
    }
}
