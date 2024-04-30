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

    @Test
    @DisplayName("loop_too_large.wx")
    void testLoopTooLarge() throws IOException {
    }

    @Test
    @DisplayName("no_reuse_constants.wx")
    void testNoReuseConstants() throws IOException {
    }

    @Test
    @DisplayName("stack_overflow.wx")
    void testStackOverflow() throws IOException {
    }

    @Test
    @DisplayName("too_many_constants.wx")
    void testTooManyConstants() throws IOException {
    }

    @Test
    @DisplayName("too_many_locals.wx")
    void testTooManyLocals() throws IOException {
    }

    @Test
    @DisplayName("too_many_upvalues.wx")
    void testTooManyUpvalues() throws IOException {
    }
}
