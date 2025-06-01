package org.example;


public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Програма запущена");

        UserService userService = new UserService();
        userService.createUser("rodion");

        BookService bookService = new BookService();
        bookService.readBook("Head First Java");

        logger.log("Програма завершила роботу");


        Logger logger2 = Logger.getInstance();
        if (logger == logger2)
            System.out.println("Перевірка успішна: logger == logger2");
        else
            System.out.println("Перевірка не успішна: logger != logger2");
    }
}
