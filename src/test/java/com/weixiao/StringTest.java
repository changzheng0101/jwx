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

public class StringTest {
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
    @DisplayName("error_after_multiline.wx")
    void testErrorAfterMultiline() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/string/error_after_multiline.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("literals.wx")
    void testLiterals() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/string/literals.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("()", output[0].trim());
		assertEquals("a string", output[1].trim());
		assertEquals("A~¶Þॐஃ", output[2].trim());
    }

    @Test
    @DisplayName("multiline.wx")
    void testMultiline() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/string/multiline.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("1", output[0].trim());
		assertEquals("2", output[1].trim());
		assertEquals("3", output[2].trim());
    }

    @Test
    @DisplayName("unterminated.wx")
    void testUnterminated() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/string/unterminated.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
