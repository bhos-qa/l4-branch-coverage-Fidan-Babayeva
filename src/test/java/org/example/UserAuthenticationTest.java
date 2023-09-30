package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserAuthenticationTest {

    @Test
    public void testWelcomeUser_XSS() {
        // Arrange
        UserAuthentication userAuth = new UserAuthentication();
        String maliciousUsername = "<script>alert('XSS Attack');</script>";

        // Act
        String greeting = userAuth.welcomeUser(maliciousUsername);

        // Assert
        assert(greeting.contains("Welcome, &lt;script&gt;alert('XSS Attack');&lt;/script&gt;"));
    }
}
