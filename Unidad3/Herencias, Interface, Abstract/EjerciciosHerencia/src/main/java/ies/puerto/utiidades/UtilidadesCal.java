package ies.puerto.utiidades;

import java.util.Scanner;

public class UtilidadesCal {
    public static String ingresarOperacion(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double operaciones(double num1, String operador, double num2){
        double resultado = 0;
        if (operador.equals("+")) {
            resultado = num1 + num2;
        }else if(operador.equals("-")){
            resultado = num1 - num2;
        }else if(operador.equals("*")){
            resultado = num1 * num2;
        }else if(operador.equals("/")){
            resultado = num1 / num2;
        }
        return resultado;
    }
    public static double operacion(String operacion){
        String[] split = operacion.split(" ");
        double num1 = Double.parseDouble(split[0]);
        String operador = split[1];
        double num2 = Double.parseDouble(split[2]);
        double resultado = operaciones(num1,operador,num2);

        System.out.print(resultado);
        operacion = ingresarOperacion();
        String operacionCompleta = Double.toString(resultado).concat(operacion);

        operacion(operacionCompleta);
        return resultado;
    }


    public static void operacionInfinita(){
        do{
            System.out.print(operacion(ingresarOperacion()));
        }while(!ingresarOperacion().equals("Exit"));
    }
}
