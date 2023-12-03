package org.example;

import static java.lang.Integer.parseInt;

/**
 * Declara un array de 3 elementos e intenta acceder al cuarto elemento.
 * Maneja la excepción ArrayIndexOutOfBoundsException.
 */
public class ClaseArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        try{
            System.out.println(array[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
