package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private final String message = "Hello World!";

    public App() {
    }

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(new App().getMessage() + "" + i++);
        }
    }

    private final String getMessage() {
        return message;
    }

}
