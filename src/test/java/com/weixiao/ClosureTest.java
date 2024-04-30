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

public class ClosureTest {
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
    @DisplayName("assign_to_closure.wx")
    void testAssignToClosure() throws IOException {
    }

    @Test
    @DisplayName("assign_to_shadowed_later.wx")
    void testAssignToShadowedLater() throws IOException {
    }

    @Test
    @DisplayName("closed_closure_in_function.wx")
    void testClosedClosureInFunction() throws IOException {
    }

    @Test
    @DisplayName("close_over_function_parameter.wx")
    void testCloseOverFunctionParameter() throws IOException {
    }

    @Test
    @DisplayName("close_over_later_variable.wx")
    void testCloseOverLaterVariable() throws IOException {
    }

    @Test
    @DisplayName("close_over_method_parameter.wx")
    void testCloseOverMethodParameter() throws IOException {
    }

    @Test
    @DisplayName("nested_closure.wx")
    void testNestedClosure() throws IOException {
    }

    @Test
    @DisplayName("open_closure_in_function.wx")
    void testOpenClosureInFunction() throws IOException {
    }

    @Test
    @DisplayName("reference_closure_multiple_times.wx")
    void testReferenceClosureMultipleTimes() throws IOException {
    }

    @Test
    @DisplayName("reuse_closure_slot.wx")
    void testReuseClosureSlot() throws IOException {
    }

    @Test
    @DisplayName("shadow_closure_with_local.wx")
    void testShadowClosureWithLocal() throws IOException {
    }

    @Test
    @DisplayName("unused_closure.wx")
    void testUnusedClosure() throws IOException {
    }

    @Test
    @DisplayName("unused_later_closure.wx")
    void testUnusedLaterClosure() throws IOException {
    }
}
