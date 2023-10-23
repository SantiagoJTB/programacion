package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercico1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest(){
        int resultado = ejercico1.calcularSueldoHoras(10);
        Assertions.assertEquals(100,resultado,"Resultado incorrecto");

    }

}
