import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class TaskOne {

    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }
    @BeforeAll
    public static void globalSetup() {
        // Инициализация
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }

}
