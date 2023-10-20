package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void mcdtestOK() {
        int resultado = 0;
        int resultadoCorrecto = 5;
        int a = 10;
        int b = 0;

        resultado = ejercicio2.mcd(a,b);
        Assertions.assertEquals(resultadoCorrecto, resultado, "Resultado incorrecto");
    }
}
