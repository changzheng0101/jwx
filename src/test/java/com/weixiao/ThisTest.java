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

public class ThisTest {
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
    @DisplayName("closure.wx")
    void testClosure() throws IOException {
    }

    @Test
    @DisplayName("nested_class.wx")
    void testNestedClass() throws IOException {
    }

    @Test
    @DisplayName("nested_closure.wx")
    void testNestedClosure() throws IOException {
    }

    @Test
    @DisplayName("this_at_top_level.wx")
    void testThisAtTopLevel() throws IOException {
    }

    @Test
    @DisplayName("this_in_method.wx")
    void testThisInMethod() throws IOException {
    }

    @Test
    @DisplayName("this_in_top_level_function.wx")
    void testThisInTopLevelFunction() throws IOException {
    }
}
