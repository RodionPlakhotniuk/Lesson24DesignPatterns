package org.example;

public class BookService {
    public void readBook(String bookname) {
        Logger logger = Logger.getInstance();
        logger.log("Книгу: " + bookname + " прочитано.");
    }
}
