package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationTest {
    Application app = new Application();

    @Test
    void should_return_1_to_3_Multiplication() {
        String actualResult = app.Multiplication(1, 3);
        String exceptedResult = "1 * 1 = 1\n" +
                "1 * 2 = 2" + "\t" + "2 * 2 = 4\n" +
                "1 * 3 = 3" + "\t" + "2 * 3 = 6" + "\t" + "3 * 3 = 9\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_return_2_to_3_Multiplication() {
        String actualResult = app.Multiplication(2, 3);
        String exceptedResult = "1 * 2 = 2" + "\t" + "2 * 2 = 4\n" +
                "1 * 3 = 3" + "\t" + "2 * 3 = 6" + "\t" + "3 * 3 = 9\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_return_1_to_4_Multiplication() {
        String actualResult = app.Multiplication(1, 5);
        String exceptedResult = "1 * 1 = 1\n" +
                "1 * 2 = 2" + "\t" + "2 * 2 = 4\n" +
                "1 * 3 = 3" + "\t" + "2 * 3 = 6" + "\t" + "3 * 3 = 9\n" +
                "1 * 4 = 4" + "\t" + "2 * 4 = 8" + "\t" + "3 * 4 = 12" + "\t" + "4 * 4 = 16\n" +
                "1 * 5 = 5" + "\t" + "2 * 5 = 10" + "\t" + "3 * 5 = 15" + "\t" + "4 * 5 = 20" + "\t" + "5 * 5 = 25\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_throw_error_when_startNumber_bigger() {
        assertThrows(IllegalArgumentException.class, () -> app.Multiplication(6, 5));

    }

    @Test
    void should_throw_error_when_startNumber_equals_endNumber() {
        assertThrows(IllegalArgumentException.class, () -> app.Multiplication(5, 5));
    }

    @Test
    void should_throw_error_when_startNumber_or_endNumber_is_minus() {
        assertThrows(IllegalArgumentException.class, () -> app.Multiplication(-4, 5));

    }
}
