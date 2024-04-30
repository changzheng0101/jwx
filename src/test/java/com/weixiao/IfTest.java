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

public class IfTest {
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
    @DisplayName("class_in_else.wx")
    void testClassInElse() throws IOException {
    }

    @Test
    @DisplayName("class_in_then.wx")
    void testClassInThen() throws IOException {
    }

    @Test
    @DisplayName("dangling_else.wx")
    void testDanglingElse() throws IOException {
    }

    @Test
    @DisplayName("else.wx")
    void testElse() throws IOException {
    }

    @Test
    @DisplayName("fun_in_else.wx")
    void testFunInElse() throws IOException {
    }

    @Test
    @DisplayName("fun_in_then.wx")
    void testFunInThen() throws IOException {
    }

    @Test
    @DisplayName("if.wx")
    void testIf() throws IOException {
    }

    @Test
    @DisplayName("truth.wx")
    void testTruth() throws IOException {
    }

    @Test
    @DisplayName("var_in_else.wx")
    void testVarInElse() throws IOException {
    }

    @Test
    @DisplayName("var_in_then.wx")
    void testVarInThen() throws IOException {
    }
}
