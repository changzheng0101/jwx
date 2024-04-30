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

public class WhileTest {
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
    @DisplayName("class_in_body.wx")
    void testClassInBody() throws IOException {
    }

    @Test
    @DisplayName("closure_in_body.wx")
    void testClosureInBody() throws IOException {
    }

    @Test
    @DisplayName("fun_in_body.wx")
    void testFunInBody() throws IOException {
    }

    @Test
    @DisplayName("return_closure.wx")
    void testReturnClosure() throws IOException {
    }

    @Test
    @DisplayName("return_inside.wx")
    void testReturnInside() throws IOException {
    }

    @Test
    @DisplayName("syntax.wx")
    void testSyntax() throws IOException {
    }

    @Test
    @DisplayName("var_in_body.wx")
    void testVarInBody() throws IOException {
    }
}
