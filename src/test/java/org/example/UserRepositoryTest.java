package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    public void testGetUserData_IDOR() {
        // Arrange
        UserRepository userRepository = new UserRepository();

        // Act
        String userData = userRepository.getUserData(1); // Attempt to access Alice's data

        // Assert
        assertNotNull(userData);
        assertEquals("Alice", userData);
    }
}
