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

public class IfTest {
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
    @DisplayName("class_in_else.wx")
    void testClassInElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/class_in_else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("class_in_then.wx")
    void testClassInThen() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/class_in_then.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("dangling_else.wx")
    void testDanglingElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/dangling_else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("good", output[0].trim());
    }

    @Test
    @DisplayName("else.wx")
    void testElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("good", output[0].trim());
		assertEquals("good", output[1].trim());
		assertEquals("block", output[2].trim());
    }

    @Test
    @DisplayName("fun_in_else.wx")
    void testFunInElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/fun_in_else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("fun_in_then.wx")
    void testFunInThen() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/fun_in_then.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("if.wx")
    void testIf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/if.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("good", output[0].trim());
		assertEquals("block", output[1].trim());
		assertEquals("true", output[2].trim());
    }

    @Test
    @DisplayName("truth.wx")
    void testTruth() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/truth.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("nil", output[1].trim());
		assertEquals("true", output[2].trim());
		assertEquals("0", output[3].trim());
		assertEquals("empty", output[4].trim());
    }

    @Test
    @DisplayName("var_in_else.wx")
    void testVarInElse() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/var_in_else.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("var_in_then.wx")
    void testVarInThen() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/if/var_in_then.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
