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

public class MethodTest {
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
    @DisplayName("arity.wx")
    void testArity() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/arity.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("no args", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("3", output[2].trim());
		assertEquals("6", output[3].trim());
		assertEquals("10", output[4].trim());
		assertEquals("15", output[5].trim());
		assertEquals("21", output[6].trim());
		assertEquals("28", output[7].trim());
		assertEquals("36", output[8].trim());
    }

    @Test
    @DisplayName("empty_block.wx")
    void testEmptyBlock() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/empty_block.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("nil", output[0].trim());
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/extra_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/missing_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("not_found.wx")
    void testNotFound() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/not_found.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("print_bound_method.wx")
    void testPrintBoundMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/print_bound_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("<fn method>", output[0].trim());
    }

    @Test
    @DisplayName("refer_to_name.wx")
    void testReferToName() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/refer_to_name.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_arguments.wx")
    void testTooManyArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/too_many_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_parameters.wx")
    void testTooManyParameters() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/method/too_many_parameters.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
