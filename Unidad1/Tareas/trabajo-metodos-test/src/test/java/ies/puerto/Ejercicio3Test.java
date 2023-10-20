package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    public void diasemanatestOK(String strDia, int numeroDia) {
        String resultado = "";

        resultado = ejercicio3.calcularDiaSemana(numeroDia);
        Assertions.assertEquals(strDia,resultado,"Resultado incorrecto");
    }

    @Test
    public void calcularLunesTestOK() {
        diasemanatestOK("Lunes",1);
        diasemanatestOK("Martes",2);
        diasemanatestOK("Miercoles",3);
        diasemanatestOK("Jueves",4);
        diasemanatestOK("Viernes",5);
        diasemanatestOK("Sabado",6);
        diasemanatestOK("Domingo",7);
    }
}
