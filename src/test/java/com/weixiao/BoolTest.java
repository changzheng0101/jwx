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

public class BoolTest {
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
    @DisplayName("equality.wx")
    void testEquality() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/bool/equality.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("false", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
		assertEquals("false", output[4].trim());
		assertEquals("false", output[5].trim());
		assertEquals("false", output[6].trim());
		assertEquals("false", output[7].trim());
		assertEquals("false", output[8].trim());
		assertEquals("false", output[9].trim());
		assertEquals("true", output[10].trim());
		assertEquals("true", output[11].trim());
		assertEquals("false", output[12].trim());
		assertEquals("true", output[13].trim());
		assertEquals("true", output[14].trim());
		assertEquals("true", output[15].trim());
		assertEquals("true", output[16].trim());
		assertEquals("true", output[17].trim());
    }

    @Test
    @DisplayName("not.wx")
    void testNot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/bool/not.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("true", output[1].trim());
		assertEquals("true", output[2].trim());
    }
}
