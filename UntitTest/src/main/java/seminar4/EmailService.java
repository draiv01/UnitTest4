package seminar4;

public class EmailService {
    private EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendWelcomeEmail(String to) {
// Логика отправки приветственного письма
        emailSender.sendEmail(to, "Добро пожаловать", "Добро пожаловать на наш сайт!");
    }
}

    public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}
