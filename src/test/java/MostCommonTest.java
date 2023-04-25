import org.example.MostCommon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MostCommonTest {
    MostCommon words;

    @BeforeEach
    void setUp() {
        words = new MostCommon();
    }

    @Test
    @DisplayName("Read from a given text file should work")
    void displayMostCommon() {
        assertNotNull(words.getResult("movie.txt"));
    }

    @Test
    @DisplayName("Reading from an empty text file")
    void emptyFileTest() {
        assertEquals(0, words.getResult("blank.txt").size());
    }
}
