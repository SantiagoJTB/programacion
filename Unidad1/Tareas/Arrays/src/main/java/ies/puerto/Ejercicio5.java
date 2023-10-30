package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    encontrarElemento();
    }
    public static void encontrarElemento(){
        int[] array= {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        for(int i = 0; i < array.length ; i++){
            if (num == array[i]){
                System.out.println("El número "+num+" está en el array");
            }else{
                System.out.println("El número no está en el array");
                break;
            }
        }
    }
}
