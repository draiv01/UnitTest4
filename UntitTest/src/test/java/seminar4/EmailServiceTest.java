package seminar4;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    @Test
    void testSendWelcomeEmailWithMock() {
// Создаем имитацию (мок) для интерфейса EmailSender
        EmailSender emailSender = mock(EmailSender.class);

// Создаем экземпляр EmailService с имитацией EmailSender
        EmailService emailService = new EmailService(emailSender);

// Задаем ожидаемый результат
        String to = "user@example.com";

// Вызываем метод sendWelcomeEmail
        emailService.sendWelcomeEmail(to);

// Проверяем, что метод sendEmail был вызван с правильными аргументами
        verify(emailSender).sendEmail(to, "Добро пожаловать", "Добро пожаловать на наш сайт!");

// Мы также можем установить другие ожидания и проверки в этом тесте, если это необходимо
    }
}
