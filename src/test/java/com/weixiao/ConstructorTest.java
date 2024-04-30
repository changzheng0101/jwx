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

public class ConstructorTest {
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
    @DisplayName("arguments.wx")
    void testArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("init", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("2", output[2].trim());
    }

    @Test
    @DisplayName("call_init_early_return.wx")
    void testCallInitEarlyReturn() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/call_init_early_return.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("init", output[0].trim());
		assertEquals("init", output[1].trim());
		assertEquals("Foo instance", output[2].trim());
    }

    @Test
    @DisplayName("call_init_explicitly.wx")
    void testCallInitExplicitly() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/call_init_explicitly.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo.init(one)", output[0].trim());
		assertEquals("Foo.init(two)", output[1].trim());
		assertEquals("Foo instance", output[2].trim());
		assertEquals("init", output[3].trim());
    }

    @Test
    @DisplayName("default.wx")
    void testDefault() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/default.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo instance", output[0].trim());
    }

    @Test
    @DisplayName("default_arguments.wx")
    void testDefaultArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/default_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("early_return.wx")
    void testEarlyReturn() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/early_return.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("init", output[0].trim());
		assertEquals("Foo instance", output[1].trim());
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/extra_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("init_not_method.wx")
    void testInitNotMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/init_not_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("not initializer", output[0].trim());
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/missing_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("return_in_nested_function.wx")
    void testReturnInNestedFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/return_in_nested_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("bar", output[0].trim());
		assertEquals("Foo instance", output[1].trim());
    }

    @Test
    @DisplayName("return_value.wx")
    void testReturnValue() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/constructor/return_value.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
