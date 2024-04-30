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

    @Test
    @DisplayName("arguments.wx")
    void testArguments() throws IOException {
    }

    @Test
    @DisplayName("call_init_early_return.wx")
    void testCallInitEarlyReturn() throws IOException {
    }

    @Test
    @DisplayName("call_init_explicitly.wx")
    void testCallInitExplicitly() throws IOException {
    }

    @Test
    @DisplayName("default.wx")
    void testDefault() throws IOException {
    }

    @Test
    @DisplayName("default_arguments.wx")
    void testDefaultArguments() throws IOException {
    }

    @Test
    @DisplayName("early_return.wx")
    void testEarlyReturn() throws IOException {
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws IOException {
    }

    @Test
    @DisplayName("init_not_method.wx")
    void testInitNotMethod() throws IOException {
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws IOException {
    }

    @Test
    @DisplayName("return_in_nested_function.wx")
    void testReturnInNestedFunction() throws IOException {
    }

    @Test
    @DisplayName("return_value.wx")
    void testReturnValue() throws IOException {
    }
}
