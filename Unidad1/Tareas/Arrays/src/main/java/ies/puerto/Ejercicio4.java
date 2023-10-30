package ies.puerto;

public class Ejercicio4 {
    public static int pares() {
        int[] array = {1, 2, 3, 4, 5};
        int par = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 == 0){
                array[i] = par;
            }
        }
        return par;
    }
    public static void main(String[] args) {
        System.out.println("Los números: "+pares()+ " son pares.");
    }
}
