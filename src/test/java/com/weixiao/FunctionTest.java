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

public class FunctionTest {
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
    @DisplayName("body_must_be_block.wx")
    void testBodyMustBeBlock() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/body_must_be_block.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("empty_body.wx")
    void testEmptyBody() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/empty_body.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("nil", output[0].trim());
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/extra_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("local_mutual_recursion.wx")
    void testLocalMutualRecursion() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/local_mutual_recursion.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("local_recursion.wx")
    void testLocalRecursion() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/local_recursion.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("21", output[0].trim());
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/missing_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("missing_comma_in_parameters.wx")
    void testMissingCommaInParameters() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/missing_comma_in_parameters.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("mutual_recursion.wx")
    void testMutualRecursion() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/mutual_recursion.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("true", output[1].trim());
    }

    @Test
    @DisplayName("nested_call_with_arguments.wx")
    void testNestedCallWithArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/nested_call_with_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("hello world", output[0].trim());
    }

    @Test
    @DisplayName("parameters.wx")
    void testParameters() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/parameters.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("0", output[0].trim());
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
    @DisplayName("print.wx")
    void testPrint() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/print.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("<fn foo>", output[0].trim());
		assertEquals("<native fn>", output[1].trim());
    }

    @Test
    @DisplayName("recursion.wx")
    void testRecursion() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/recursion.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("21", output[0].trim());
    }

    @Test
    @DisplayName("too_many_arguments.wx")
    void testTooManyArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/too_many_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_parameters.wx")
    void testTooManyParameters() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/function/too_many_parameters.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
