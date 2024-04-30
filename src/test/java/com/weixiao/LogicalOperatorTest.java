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

public class LogicalOperatorTest {
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
    @DisplayName("and.wx")
    void testAnd() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/logical_operator/and.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
		assertEquals("3", output[4].trim());
		assertEquals("true", output[5].trim());
		assertEquals("false", output[6].trim());
    }

    @Test
    @DisplayName("and_truth.wx")
    void testAndTruth() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/logical_operator/and_truth.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("nil", output[1].trim());
		assertEquals("ok", output[2].trim());
		assertEquals("ok", output[3].trim());
		assertEquals("ok", output[4].trim());
    }

    @Test
    @DisplayName("or.wx")
    void testOr() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/logical_operator/or.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("1", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("true", output[2].trim());
		assertEquals("false", output[3].trim());
		assertEquals("false", output[4].trim());
		assertEquals("false", output[5].trim());
		assertEquals("true", output[6].trim());
    }

    @Test
    @DisplayName("or_truth.wx")
    void testOrTruth() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/logical_operator/or_truth.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
		assertEquals("ok", output[1].trim());
		assertEquals("true", output[2].trim());
		assertEquals("0", output[3].trim());
		assertEquals("s", output[4].trim());
    }
}
