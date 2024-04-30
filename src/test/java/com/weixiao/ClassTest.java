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

public class ClassTest {
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
    @DisplayName("empty.wx")
    void testEmpty() throws IOException {
    }

    @Test
    @DisplayName("inherited_method.wx")
    void testInheritedMethod() throws IOException {
    }

    @Test
    @DisplayName("inherit_self.wx")
    void testInheritSelf() throws IOException {
    }

    @Test
    @DisplayName("local_inherit_other.wx")
    void testLocalInheritOther() throws IOException {
    }

    @Test
    @DisplayName("local_inherit_self.wx")
    void testLocalInheritSelf() throws IOException {
    }

    @Test
    @DisplayName("local_reference_self.wx")
    void testLocalReferenceSelf() throws IOException {
    }

    @Test
    @DisplayName("reference_self.wx")
    void testReferenceSelf() throws IOException {
    }
}
