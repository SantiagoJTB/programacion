import ies.puerto.Ejercicio3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEjercicio3 {

    @Test
    public void testMayor() {

        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 5; // El número máximo en el array es 5

        int actualResult = Ejercicio3.mayor();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMenor() {

        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 1; // El número mínimo en el array es 1

        int actualResult = Ejercicio3.menor();

        assertEquals(expectedResult, actualResult);
    }
}
