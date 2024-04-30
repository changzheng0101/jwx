import static com.github.stefanbirkner.systemlambda.SystemLambda.catchSystemExit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.weixiao.Wx;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class MyFirstTest {
    private final String lineSeparator = System.getProperty("line.separator");
    private final PrintStream standardOut = System.out;
    private final PrintStream standardErr = System.err;
    private final ByteArrayOutputStream standardOutputStreamCaptor = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errOutputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(standardOutputStreamCaptor));
        System.setErr(new PrintStream(errOutputStreamCaptor));
        Wx.reset();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("empty_file.wx")
    void testEmptyFile() throws IOException {
        String[] args = {"src/test/java/files/empty_file.wx"};
        Wx.main(args);
    }

    @Test
    @DisplayName("precedence.wx")
    void testPrecedence() throws Exception {
        String[] args = {"src/test/java/files/precedence.wx"};
        Wx.main(args);
        System.setOut(standardOut);
        String[] split = standardOutputStreamCaptor.toString().split(lineSeparator);
        Arrays.stream(split).forEach(System.out::println);
        assertEquals("14", split[0].trim());
        assertEquals("8", split[1].trim());
        assertEquals("4", split[2].trim());
    }

    @Test
    @DisplayName("unexpected_character.wx")
    void testUnexpectedCharacter() throws Exception {
        String[] args = {"src/test/java/files/unexpected_character.wx"};
        int statusCode = catchSystemExit(() -> Wx.main(args));
        assertEquals(65, statusCode);
        assertEquals("[line 3] Error: Unexpected character." + lineSeparator + "[line 3] Error at 'b': Expect ')' after arguments.",
                errOutputStreamCaptor.toString().trim());
    }
}
