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

public class NumberTest {
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
    @DisplayName("decimal_point_at_eof.wx")
    void testDecimalPointAtEof() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/number/decimal_point_at_eof.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("leading_dot.wx")
    void testLeadingDot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/number/leading_dot.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("literals.wx")
    void testLiterals() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/number/literals.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("123", output[0].trim());
		assertEquals("987654", output[1].trim());
		assertEquals("0", output[2].trim());
		assertEquals("-0", output[3].trim());
		assertEquals("123.456", output[4].trim());
		assertEquals("-0.001", output[5].trim());
    }

    @Test
    @DisplayName("nan_equality.wx")
    void testNanEquality() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/number/nan_equality.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("true", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
    }

    @Test
    @DisplayName("trailing_dot.wx")
    void testTrailingDot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/number/trailing_dot.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
