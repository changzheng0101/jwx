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

public class AssignmentTest {
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
    @DisplayName("associativity.wx")
    void testAssociativity() throws IOException {
    }

    @Test
    @DisplayName("global.wx")
    void testGlobal() throws IOException {
    }

    @Test
    @DisplayName("grouping.wx")
    void testGrouping() throws IOException {
    }

    @Test
    @DisplayName("infix_operator.wx")
    void testInfixOperator() throws IOException {
    }

    @Test
    @DisplayName("local.wx")
    void testLocal() throws IOException {
    }

    @Test
    @DisplayName("prefix_operator.wx")
    void testPrefixOperator() throws IOException {
    }

    @Test
    @DisplayName("syntax.wx")
    void testSyntax() throws IOException {
    }

    @Test
    @DisplayName("to_this.wx")
    void testToThis() throws IOException {
    }

    @Test
    @DisplayName("undefined.wx")
    void testUndefined() throws IOException {
    }
}
