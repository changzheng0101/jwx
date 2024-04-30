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

public class LimitTest {
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
    @DisplayName("loop_too_large.wx")
    void testLoopTooLarge() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/loop_too_large.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("no_reuse_constants.wx")
    void testNoReuseConstants() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/no_reuse_constants.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("stack_overflow.wx")
    void testStackOverflow() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/stack_overflow.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_constants.wx")
    void testTooManyConstants() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/too_many_constants.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_locals.wx")
    void testTooManyLocals() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/too_many_locals.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("too_many_upvalues.wx")
    void testTooManyUpvalues() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/limit/too_many_upvalues.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
