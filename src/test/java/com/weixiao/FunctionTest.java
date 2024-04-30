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

public class FunctionTest {
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
    @DisplayName("body_must_be_block.wx")
    void testBodyMustBeBlock() throws IOException {
    }

    @Test
    @DisplayName("empty_body.wx")
    void testEmptyBody() throws IOException {
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws IOException {
    }

    @Test
    @DisplayName("local_mutual_recursion.wx")
    void testLocalMutualRecursion() throws IOException {
    }

    @Test
    @DisplayName("local_recursion.wx")
    void testLocalRecursion() throws IOException {
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws IOException {
    }

    @Test
    @DisplayName("missing_comma_in_parameters.wx")
    void testMissingCommaInParameters() throws IOException {
    }

    @Test
    @DisplayName("mutual_recursion.wx")
    void testMutualRecursion() throws IOException {
    }

    @Test
    @DisplayName("nested_call_with_arguments.wx")
    void testNestedCallWithArguments() throws IOException {
    }

    @Test
    @DisplayName("parameters.wx")
    void testParameters() throws IOException {
    }

    @Test
    @DisplayName("print.wx")
    void testPrint() throws IOException {
    }

    @Test
    @DisplayName("recursion.wx")
    void testRecursion() throws IOException {
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
