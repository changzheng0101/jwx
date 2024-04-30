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

public class MethodTest {
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
    @DisplayName("arity.wx")
    void testArity() throws IOException {
    }

    @Test
    @DisplayName("empty_block.wx")
    void testEmptyBlock() throws IOException {
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws IOException {
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws IOException {
    }

    @Test
    @DisplayName("not_found.wx")
    void testNotFound() throws IOException {
    }

    @Test
    @DisplayName("print_bound_method.wx")
    void testPrintBoundMethod() throws IOException {
    }

    @Test
    @DisplayName("refer_to_name.wx")
    void testReferToName() throws IOException {
    }

    @Test
    @DisplayName("too_many_arguments.wx")
    void testTooManyArguments() throws IOException {
    }

    @Test
    @DisplayName("too_many_parameters.wx")
    void testTooManyParameters() throws IOException {
    }
}
