package org.example;

public class UserService {
    public void createUser(String username) {
        Logger logger = Logger.getInstance();
        logger.log("Користувача '" + username + "' створено.");
    }
}
