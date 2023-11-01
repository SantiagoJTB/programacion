import ies.puerto.Ejercicio2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class TestEjercicio2 {

        @Test
        public void testMedia() {

            int[] array = {1, 2, 3, 4, 5};
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }

            int expectedResult = suma / array.length+1;

            int actualResult = Ejercicio2.media();

            assertEquals(expectedResult, actualResult);
        }
    }

