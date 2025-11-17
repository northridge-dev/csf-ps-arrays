import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.*;

public class BirthdayTests {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        originalOut = System.out;
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Tests that the simulation reports correct average and median for birthday problem")
    public void testSimulationOutput() {
        int trials = 100000;
        Birthday.main(new String[]{String.valueOf(trials)});
        String output = out.toString().trim();
        String[] lines = output.split("\n");

        assertEquals(2, lines.length, "Should have 2 output lines");

        double average = Double.parseDouble(lines[0]);
        int median = Integer.parseInt(lines[1]);

        assertTrue(average >= 24.5 && average <= 25.5, "Average number of people entering the room should be between 24.5 and 25.5");
        assertEquals(23, median, "Number of people for a 50% chance of shared birthday should be 23");
    }
}
