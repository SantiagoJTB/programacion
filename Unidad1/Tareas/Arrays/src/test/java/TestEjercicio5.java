import ies.puerto.Ejercicio5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestEjercicio5 {

    @Test
    public void testEncontrarElemento_NumeroEnArray() {

        String input = "3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedOutput = "El número 3 está en el array\n";

        Ejercicio5.encontrarElemento();
        String actualOutput = outContent.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEncontrarElemento_NumeroNoEnArray() {

        String input = "8\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedOutput = "El número no está en el array\n";

        Ejercicio5.encontrarElemento();
        String actualOutput = outContent.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
