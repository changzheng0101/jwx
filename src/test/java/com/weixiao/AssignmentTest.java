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

public class AssignmentTest {
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
    @DisplayName("associativity.wx")
    void testAssociativity() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/associativity.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("c", output[0].trim());
		assertEquals("c", output[1].trim());
		assertEquals("c", output[2].trim());
    }

    @Test
    @DisplayName("global.wx")
    void testGlobal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/global.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("before", output[0].trim());
		assertEquals("after", output[1].trim());
		assertEquals("arg", output[2].trim());
		assertEquals("arg", output[3].trim());
    }

    @Test
    @DisplayName("grouping.wx")
    void testGrouping() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/grouping.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("infix_operator.wx")
    void testInfixOperator() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/infix_operator.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("local.wx")
    void testLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("before", output[0].trim());
		assertEquals("after", output[1].trim());
		assertEquals("arg", output[2].trim());
		assertEquals("arg", output[3].trim());
    }

    @Test
    @DisplayName("prefix_operator.wx")
    void testPrefixOperator() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/prefix_operator.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("syntax.wx")
    void testSyntax() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/syntax.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("var", output[0].trim());
		assertEquals("var", output[1].trim());
    }

    @Test
    @DisplayName("to_this.wx")
    void testToThis() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/to_this.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("undefined.wx")
    void testUndefined() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/assignment/undefined.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
