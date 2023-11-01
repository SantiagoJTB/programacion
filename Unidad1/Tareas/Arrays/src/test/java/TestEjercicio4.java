import ies.puerto.Ejercicio4;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestEjercicio4 {

    @Test
    public void testMostrarPares() {

        String expectedOutput = "Los números pares son: 2 4 ";

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Ejercicio4.mostrarPares();
        String actualOutput = outContent.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
