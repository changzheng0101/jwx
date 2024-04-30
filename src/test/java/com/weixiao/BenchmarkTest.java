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

public class BenchmarkTest {
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
    @DisplayName("binary_trees.wx")
    void testBinaryTrees() throws IOException {
    }

    @Test
    @DisplayName("equality.wx")
    void testEquality() throws IOException {
    }

    @Test
    @DisplayName("fib.wx")
    void testFib() throws IOException {
    }

    @Test
    @DisplayName("instantiation.wx")
    void testInstantiation() throws IOException {
    }

    @Test
    @DisplayName("invocation.wx")
    void testInvocation() throws IOException {
    }

    @Test
    @DisplayName("method_call.wx")
    void testMethodCall() throws IOException {
    }

    @Test
    @DisplayName("properties.wx")
    void testProperties() throws IOException {
    }

    @Test
    @DisplayName("string_equality.wx")
    void testStringEquality() throws IOException {
    }

    @Test
    @DisplayName("trees.wx")
    void testTrees() throws IOException {
    }

    @Test
    @DisplayName("zoo.wx")
    void testZoo() throws IOException {
    }

    @Test
    @DisplayName("zoo_batch.wx")
    void testZooBatch() throws IOException {
    }
}
