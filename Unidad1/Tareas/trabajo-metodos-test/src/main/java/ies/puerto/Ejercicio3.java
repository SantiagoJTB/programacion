package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio 3");
    }

    public String calcularDiaSemana(int dia){
        String resultado = "Domingo";

        switch (dia){
                 case 1:
                 resultado = "Lunes";

                 case 2:
                 resultado = "Martes";

                 case 3:
                 resultado = "Miercoles";

                 case 4:
                 resultado = "Jueves";

                 case 5:
                 resultado = "Viernes";

                 case 6:
                 resultado = "Sabado";

                 case 7:
                 resultado = "Domingo";
                }
        return resultado;
    }
}