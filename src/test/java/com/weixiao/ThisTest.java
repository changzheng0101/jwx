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

public class ThisTest {
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
    @DisplayName("closure.wx")
    void testClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo", output[0].trim());
    }

    @Test
    @DisplayName("nested_class.wx")
    void testNestedClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/nested_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Outer instance", output[0].trim());
		assertEquals("Outer instance", output[1].trim());
		assertEquals("Inner instance", output[2].trim());
    }

    @Test
    @DisplayName("nested_closure.wx")
    void testNestedClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/nested_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo", output[0].trim());
    }

    @Test
    @DisplayName("this_at_top_level.wx")
    void testThisAtTopLevel() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/this_at_top_level.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("this_in_method.wx")
    void testThisInMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/this_in_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("baz", output[0].trim());
    }

    @Test
    @DisplayName("this_in_top_level_function.wx")
    void testThisInTopLevelFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/this/this_in_top_level_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
