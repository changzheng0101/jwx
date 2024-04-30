package com.weixiao;

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

public class FilesTest {
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
    void testEmptyFile() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/empty_file.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("precedence.wx")
    void testPrecedence() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/precedence.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("14", output[0].trim());
		assertEquals("8", output[1].trim());
		assertEquals("4", output[2].trim());
		assertEquals("0", output[3].trim());
		assertEquals("true", output[4].trim());
		assertEquals("true", output[5].trim());
		assertEquals("true", output[6].trim());
		assertEquals("true", output[7].trim());
		assertEquals("0", output[8].trim());
		assertEquals("0", output[9].trim());
		assertEquals("0", output[10].trim());
		assertEquals("0", output[11].trim());
		assertEquals("4", output[12].trim());
    }

    @Test
    @DisplayName("unexpected_character.wx")
    void testUnexpectedCharacter() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/unexpected_character.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
