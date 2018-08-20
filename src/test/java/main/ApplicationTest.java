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
}
