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

public class ForTest {
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
    @DisplayName("class_in_body.wx")
    void testClassInBody() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/class_in_body.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("closure_in_body.wx")
    void testClosureInBody() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/closure_in_body.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("4", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("4", output[2].trim());
		assertEquals("2", output[3].trim());
		assertEquals("4", output[4].trim());
		assertEquals("3", output[5].trim());
    }

    @Test
    @DisplayName("fun_in_body.wx")
    void testFunInBody() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/fun_in_body.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("return_closure.wx")
    void testReturnClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/return_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("i", output[0].trim());
    }

    @Test
    @DisplayName("return_inside.wx")
    void testReturnInside() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/return_inside.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("i", output[0].trim());
    }

    @Test
    @DisplayName("scope.wx")
    void testScope() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/scope.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("0", output[0].trim());
		assertEquals("-1", output[1].trim());
		assertEquals("after", output[2].trim());
		assertEquals("0", output[3].trim());
    }

    @Test
    @DisplayName("statement_condition.wx")
    void testStatementCondition() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/statement_condition.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("statement_increment.wx")
    void testStatementIncrement() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/statement_increment.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("statement_initializer.wx")
    void testStatementInitializer() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/statement_initializer.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("syntax.wx")
    void testSyntax() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/syntax.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("1", output[0].trim());
		assertEquals("2", output[1].trim());
		assertEquals("3", output[2].trim());
		assertEquals("0", output[3].trim());
		assertEquals("1", output[4].trim());
		assertEquals("2", output[5].trim());
		assertEquals("done", output[6].trim());
		assertEquals("0", output[7].trim());
		assertEquals("1", output[8].trim());
		assertEquals("0", output[9].trim());
		assertEquals("1", output[10].trim());
		assertEquals("2", output[11].trim());
		assertEquals("0", output[12].trim());
		assertEquals("1", output[13].trim());
    }

    @Test
    @DisplayName("var_in_body.wx")
    void testVarInBody() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/for/var_in_body.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
