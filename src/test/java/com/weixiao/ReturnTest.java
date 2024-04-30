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

public class ReturnTest {
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
    @DisplayName("after_else.wx")
    void testAfterElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/after_else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("after_if.wx")
    void testAfterIf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/after_if.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("after_while.wx")
    void testAfterWhile() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/after_while.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("at_top_level.wx")
    void testAtTopLevel() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/at_top_level.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("in_function.wx")
    void testInFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/in_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("in_method.wx")
    void testInMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/in_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("return_nil_if_no_value.wx")
    void testReturnNilIfNoValue() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/return/return_nil_if_no_value.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("nil", output[0].trim());
    }
}
