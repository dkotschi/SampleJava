package sample.Service;

public interface EmailClient {

    EmailResponse send(String address, String message);
}