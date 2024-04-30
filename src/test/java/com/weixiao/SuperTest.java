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

public class SuperTest {
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
    @DisplayName("bound_method.wx")
    void testBoundMethod() throws IOException {
    }

    @Test
    @DisplayName("call_other_method.wx")
    void testCallOtherMethod() throws IOException {
    }

    @Test
    @DisplayName("call_same_method.wx")
    void testCallSameMethod() throws IOException {
    }

    @Test
    @DisplayName("closure.wx")
    void testClosure() throws IOException {
    }

    @Test
    @DisplayName("constructor.wx")
    void testConstructor() throws IOException {
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws IOException {
    }

    @Test
    @DisplayName("indirectly_inherited.wx")
    void testIndirectlyInherited() throws IOException {
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws IOException {
    }

    @Test
    @DisplayName("no_superclass_bind.wx")
    void testNoSuperclassBind() throws IOException {
    }

    @Test
    @DisplayName("no_superclass_call.wx")
    void testNoSuperclassCall() throws IOException {
    }

    @Test
    @DisplayName("no_superclass_method.wx")
    void testNoSuperclassMethod() throws IOException {
    }

    @Test
    @DisplayName("parenthesized.wx")
    void testParenthesized() throws IOException {
    }

    @Test
    @DisplayName("reassign_superclass.wx")
    void testReassignSuperclass() throws IOException {
    }

    @Test
    @DisplayName("super_at_top_level.wx")
    void testSuperAtTopLevel() throws IOException {
    }

    @Test
    @DisplayName("super_in_closure_in_inherited_method.wx")
    void testSuperInClosureInInheritedMethod() throws IOException {
    }

    @Test
    @DisplayName("super_in_inherited_method.wx")
    void testSuperInInheritedMethod() throws IOException {
    }

    @Test
    @DisplayName("super_in_top_level_function.wx")
    void testSuperInTopLevelFunction() throws IOException {
    }

    @Test
    @DisplayName("super_without_dot.wx")
    void testSuperWithoutDot() throws IOException {
    }

    @Test
    @DisplayName("super_without_name.wx")
    void testSuperWithoutName() throws IOException {
    }

    @Test
    @DisplayName("this_in_superclass_method.wx")
    void testThisInSuperclassMethod() throws IOException {
    }
}
