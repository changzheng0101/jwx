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

public class ReturnTest {
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
    @DisplayName("after_else.wx")
    void testAfterElse() throws IOException {
    }

    @Test
    @DisplayName("after_if.wx")
    void testAfterIf() throws IOException {
    }

    @Test
    @DisplayName("after_while.wx")
    void testAfterWhile() throws IOException {
    }

    @Test
    @DisplayName("at_top_level.wx")
    void testAtTopLevel() throws IOException {
    }

    @Test
    @DisplayName("in_function.wx")
    void testInFunction() throws IOException {
    }

    @Test
    @DisplayName("in_method.wx")
    void testInMethod() throws IOException {
    }

    @Test
    @DisplayName("return_nil_if_no_value.wx")
    void testReturnNilIfNoValue() throws IOException {
    }
}
