import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.*;

public class CardCollectorTests {
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
    @DisplayName("Tests that the simulation reports correct average draws for suits and ranks")
    public void testSimulationOutput() {
        int trials = 10000;
        CardCollector.main(new String[]{String.valueOf(trials)});
        String output = out.toString().trim();
        String[] lines = output.split("\n");

        // Should have 2 lines: average suit draws and average rank draws
        assertEquals(2, lines.length, "Should have 2 output lines");

        double avgSuitDraws = Double.parseDouble(lines[0]);
        double avgRankDraws = Double.parseDouble(lines[1]);

        // Expected values based on simulation
        // Allowing variance for probabilistic simulation
        assertTrue((avgSuitDraws > 7.4 && avgSuitDraws < 7.9) || (avgSuitDraws > 8.1 && avgSuitDraws < 8.6), "Average suit draws should be around 7.6 (without replacement) or 8.3 (with replacement)");
        assertTrue((avgRankDraws > 26.0 && avgRankDraws < 31.0) || (avgRankDraws > 39.0 && avgRankDraws < 43.0), "Average rank draws should be around 28 (without replacement) or 41 (with replacement)");
    }
}
