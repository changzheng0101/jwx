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

public class VariableTest {
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
    @DisplayName("collide_with_parameter.wx")
    void testCollideWithParameter() throws IOException {
    }

    @Test
    @DisplayName("duplicate_local.wx")
    void testDuplicateLocal() throws IOException {
    }

    @Test
    @DisplayName("duplicate_parameter.wx")
    void testDuplicateParameter() throws IOException {
    }

    @Test
    @DisplayName("early_bound.wx")
    void testEarlyBound() throws IOException {
    }

    @Test
    @DisplayName("in_middle_of_block.wx")
    void testInMiddleOfBlock() throws IOException {
    }

    @Test
    @DisplayName("in_nested_block.wx")
    void testInNestedBlock() throws IOException {
    }

    @Test
    @DisplayName("local_from_method.wx")
    void testLocalFromMethod() throws IOException {
    }

    @Test
    @DisplayName("redeclare_global.wx")
    void testRedeclareGlobal() throws IOException {
    }

    @Test
    @DisplayName("redefine_global.wx")
    void testRedefineGlobal() throws IOException {
    }

    @Test
    @DisplayName("scope_reuse_in_different_blocks.wx")
    void testScopeReuseInDifferentBlocks() throws IOException {
    }

    @Test
    @DisplayName("shadow_and_local.wx")
    void testShadowAndLocal() throws IOException {
    }

    @Test
    @DisplayName("shadow_global.wx")
    void testShadowGlobal() throws IOException {
    }

    @Test
    @DisplayName("shadow_local.wx")
    void testShadowLocal() throws IOException {
    }

    @Test
    @DisplayName("undefined_global.wx")
    void testUndefinedGlobal() throws IOException {
    }

    @Test
    @DisplayName("undefined_local.wx")
    void testUndefinedLocal() throws IOException {
    }

    @Test
    @DisplayName("uninitialized.wx")
    void testUninitialized() throws IOException {
    }

    @Test
    @DisplayName("unreached_undefined.wx")
    void testUnreachedUndefined() throws IOException {
    }

    @Test
    @DisplayName("use_false_as_var.wx")
    void testUseFalseAsVar() throws IOException {
    }

    @Test
    @DisplayName("use_global_in_initializer.wx")
    void testUseGlobalInInitializer() throws IOException {
    }

    @Test
    @DisplayName("use_local_in_initializer.wx")
    void testUseLocalInInitializer() throws IOException {
    }

    @Test
    @DisplayName("use_nil_as_var.wx")
    void testUseNilAsVar() throws IOException {
    }

    @Test
    @DisplayName("use_this_as_var.wx")
    void testUseThisAsVar() throws IOException {
    }
}
