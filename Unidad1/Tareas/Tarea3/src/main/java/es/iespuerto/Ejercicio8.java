package es.iespuerto;
import java.util.Scanner;

public class Ejercicio8 {

    // Función para comprobar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número máximo: ");

        int limite = scanner.nextInt();

        if (limite <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            System.out.println("Los números perfectos desde 1 a " + limite + " son:");

            //Bucle para mostrar todos los número perfectos encontrados
            for (int i = 2; i <= limite; i++) {
                if (esNumeroPerfecto(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
