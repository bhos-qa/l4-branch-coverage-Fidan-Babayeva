package org.example;

public class UserAuthentication {

    // Vulnerable method that does not properly escape user input
    public String welcomeUser(String username) {
        String greeting = "Welcome, " + username + "!";
        return "<div>" + greeting + "</div>";
    }
}

