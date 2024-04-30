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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("collide_with_parameter.wx")
    void testCollideWithParameter() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/collide_with_parameter.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("duplicate_local.wx")
    void testDuplicateLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/duplicate_local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("duplicate_parameter.wx")
    void testDuplicateParameter() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/duplicate_parameter.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("early_bound.wx")
    void testEarlyBound() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/early_bound.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("outer", output[0].trim());
		assertEquals("outer", output[1].trim());
    }

    @Test
    @DisplayName("in_middle_of_block.wx")
    void testInMiddleOfBlock() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/in_middle_of_block.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
		assertEquals("a b", output[1].trim());
		assertEquals("a c", output[2].trim());
		assertEquals("a b d", output[3].trim());
    }

    @Test
    @DisplayName("in_nested_block.wx")
    void testInNestedBlock() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/in_nested_block.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("outer", output[0].trim());
    }

    @Test
    @DisplayName("local_from_method.wx")
    void testLocalFromMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/local_from_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("variable", output[0].trim());
    }

    @Test
    @DisplayName("redeclare_global.wx")
    void testRedeclareGlobal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/redeclare_global.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("nil", output[0].trim());
    }

    @Test
    @DisplayName("redefine_global.wx")
    void testRedefineGlobal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/redefine_global.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("2", output[0].trim());
    }

    @Test
    @DisplayName("scope_reuse_in_different_blocks.wx")
    void testScopeReuseInDifferentBlocks() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/scope_reuse_in_different_blocks.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("first", output[0].trim());
		assertEquals("second", output[1].trim());
    }

    @Test
    @DisplayName("shadow_and_local.wx")
    void testShadowAndLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/shadow_and_local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("outer", output[0].trim());
		assertEquals("inner", output[1].trim());
    }

    @Test
    @DisplayName("shadow_global.wx")
    void testShadowGlobal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/shadow_global.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("shadow", output[0].trim());
		assertEquals("global", output[1].trim());
    }

    @Test
    @DisplayName("shadow_local.wx")
    void testShadowLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/shadow_local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("shadow", output[0].trim());
		assertEquals("local", output[1].trim());
    }

    @Test
    @DisplayName("undefined_global.wx")
    void testUndefinedGlobal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/undefined_global.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("undefined_local.wx")
    void testUndefinedLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/undefined_local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("uninitialized.wx")
    void testUninitialized() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/uninitialized.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("nil", output[0].trim());
    }

    @Test
    @DisplayName("unreached_undefined.wx")
    void testUnreachedUndefined() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/unreached_undefined.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("use_false_as_var.wx")
    void testUseFalseAsVar() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/use_false_as_var.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("use_global_in_initializer.wx")
    void testUseGlobalInInitializer() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/use_global_in_initializer.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("value", output[0].trim());
    }

    @Test
    @DisplayName("use_local_in_initializer.wx")
    void testUseLocalInInitializer() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/use_local_in_initializer.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("use_nil_as_var.wx")
    void testUseNilAsVar() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/use_nil_as_var.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("use_this_as_var.wx")
    void testUseThisAsVar() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/variable/use_this_as_var.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
