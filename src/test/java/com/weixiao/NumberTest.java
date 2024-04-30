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

public class NumberTest {
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
    @DisplayName("decimal_point_at_eof.wx")
    void testDecimalPointAtEof() throws IOException {
    }

    @Test
    @DisplayName("leading_dot.wx")
    void testLeadingDot() throws IOException {
    }

    @Test
    @DisplayName("literals.wx")
    void testLiterals() throws IOException {
    }

    @Test
    @DisplayName("nan_equality.wx")
    void testNanEquality() throws IOException {
    }

    @Test
    @DisplayName("trailing_dot.wx")
    void testTrailingDot() throws IOException {
    }
}
