package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {
    @Test
    void should_fail() {
        Application app = new Application();
        assertEquals(app.test(), 2);
        assertTrue(true);
    }
}
