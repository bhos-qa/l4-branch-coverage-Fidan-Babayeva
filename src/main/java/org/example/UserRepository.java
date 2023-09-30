package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, String> userDatabase;

    public UserRepository() {
        // Initialize user database with sample data
        userDatabase = new HashMap<>();
        userDatabase.put(1, "Alice");
        userDatabase.put(2, "Bob");
        userDatabase.put(3, "Charlie");
    }

    // Vulnerable method with IDOR
    public String getUserData(int userId) {
        if (userDatabase.containsKey(userId)) {
            return userDatabase.get(userId);
        } else {
            return "User not found";
        }
    }
}
