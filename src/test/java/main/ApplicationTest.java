package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    void should_return_1_to_3_Multiplication() {
        Application app = new Application();
        String actualResult = app.Multiplication(1, 3);
        String exceptedResult = "1 * 1 = 1\n" +
                "1 * 2 = 2   2 * 2 = 4\n" +
                "1 * 3 = 3   2 * 3 = 6   3 * 3 = 9\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_return_2_to_3_Multiplication() {
        Application app = new Application();
        String actualResult = app.Multiplication(2, 3);
        String exceptedResult = "1 * 2 = 2   2 * 2 = 4\n" +
                "1 * 3 = 3   2 * 3 = 6   3 * 3 = 9\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_return_1_to_4_Multiplication() {
        Application app = new Application();
        String actualResult = app.Multiplication(1, 5);
        String exceptedResult = "1 * 1 = 1\n" +
                "1 * 2 = 2   2 * 2 = 4\n" +
                "1 * 3 = 3   2 * 3 = 6   3 * 3 = 9\n" +
                "1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16\n" +
                "1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   5 * 5 = 25\n";
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    void should_throw_error_when_startNumber_bigger() {
        Application app = new Application();
        try {
            app.Multiplication(6, 5);
        } catch (IllegalArgumentException error) {
            assertEquals("IllegalArgumentException", error.getMessage());
        }
    }

    @Test
    void should_throw_error_when_startNumber_equals_endNumber() {
        Application app = new Application();
        try {
            app.Multiplication(5, 5);
        } catch (IllegalArgumentException error) {
            assertEquals("IllegalArgumentException", error.getMessage());
        }
    }

    @Test
    void should_throw_error_when_startNumber_or_endNumber_is_minus() {
        Application app = new Application();
        try {
            app.Multiplication(-2, 5);
        } catch (IllegalArgumentException error) {
            assertEquals("IllegalArgumentException", error.getMessage());
        }
    }
}
