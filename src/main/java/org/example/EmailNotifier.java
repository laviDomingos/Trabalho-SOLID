package org.example;

public class EmailNotifier implements Notifier {


    @Override
    public void notify(String email, String message) {
        System.out.println("Enviando e-mail para " + email + ":" + message);
    }
}
