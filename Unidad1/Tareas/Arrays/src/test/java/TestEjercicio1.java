import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ejercicio1Test {

    @Test
    public void testSumar() {
        int resultadoEsperado = 15; // La suma esperada de {1, 2, 3, 4, 5} es 15
        int resultadoObtenido = Ejercicio1.sumar();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}