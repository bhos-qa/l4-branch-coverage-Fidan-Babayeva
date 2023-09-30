package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class FileLoaderTest {

    @Test
    public void testLoadFile() throws IOException {
        // Arrange
        FileLoader loader = new FileLoader();
        String filename = "resources/valid-file.txt"; // Assuming a valid file

        // Act
        String content = loader.loadFile(filename);

        // Assert
        assertNotNull(content);
    }
}
