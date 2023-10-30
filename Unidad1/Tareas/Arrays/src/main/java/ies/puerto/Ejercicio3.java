package ies.puerto;

public class Ejercicio3 {
    public static int mayor() {
        int[] array = {1, 2, 3, 4, 5};
        int mayor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
            }

        }
        return mayor;
    }
    public static int menor() {
        int[] array = {1, 2, 3, 4, 5};
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor){
                menor = array[i];
            }

        }
        return menor;
    }

    public static void main(String[] args) {
        System.out.println("el número máximo es: "+mayor());
        System.out.println("el número mínimo es: "+menor());

    }
}
