import ies.puerto.Ejercicio1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEjercicio1 {

    @Test
    public void testSumar() {

        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = Ejercicio1.sumar();

        assertEquals(expectedResult, actualResult);
    }
}