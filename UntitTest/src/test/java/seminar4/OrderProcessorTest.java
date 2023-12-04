package seminar4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }



    @Test
    void testProcessOrder() {
// Создаем фиктивный объект Order (Dummy)
    Order dummyOrder = createDummyOrder();

// Создаем экземпляр OrderProcessor
    OrderProcessor orderProcessor = new OrderProcessor();

// Вызываем метод processOrder, передавая фиктивный объект Order
    orderProcessor.processOrder(dummyOrder);

// Здесь можно добавить утверждения (assertions) для проверки поведения метода
// Например, можно утверждать, что метод отправил уведомление клиенту и т.д.
        }

    private Order createDummyOrder() {
    Order dummyOrder = new Order();
// Заполняем фиктивные данные для объекта Order
    dummyOrder.setOrderId(1);
    dummyOrder.setCustomerName("John Doe");
    return dummyOrder;
        }
    }
}