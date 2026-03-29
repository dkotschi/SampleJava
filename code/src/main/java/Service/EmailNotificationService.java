package Service;

public class EmailNotificationService {

    private final EmailClient emailClient;

    public EmailNotificationService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public boolean sendWelcomeEmail(String email) {

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        EmailResponse response = emailClient.send(email, "Welcome!");

        return response != null && response.success();
    }
}