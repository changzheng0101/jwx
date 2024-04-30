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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("assign_to_closure.wx")
    void testAssignToClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/assign_to_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("local", output[0].trim());
		assertEquals("after f", output[1].trim());
		assertEquals("after f", output[2].trim());
		assertEquals("after g", output[3].trim());
    }

    @Test
    @DisplayName("assign_to_shadowed_later.wx")
    void testAssignToShadowedLater() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/assign_to_shadowed_later.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("inner", output[0].trim());
		assertEquals("assigned", output[1].trim());
    }

    @Test
    @DisplayName("closed_closure_in_function.wx")
    void testClosedClosureInFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/closed_closure_in_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("local", output[0].trim());
    }

    @Test
    @DisplayName("close_over_function_parameter.wx")
    void testCloseOverFunctionParameter() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/close_over_function_parameter.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("param", output[0].trim());
    }

    @Test
    @DisplayName("close_over_later_variable.wx")
    void testCloseOverLaterVariable() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/close_over_later_variable.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("b", output[0].trim());
		assertEquals("a", output[1].trim());
    }

    @Test
    @DisplayName("close_over_method_parameter.wx")
    void testCloseOverMethodParameter() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/close_over_method_parameter.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("param", output[0].trim());
    }

    @Test
    @DisplayName("nested_closure.wx")
    void testNestedClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/nested_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
		assertEquals("b", output[1].trim());
		assertEquals("c", output[2].trim());
    }

    @Test
    @DisplayName("open_closure_in_function.wx")
    void testOpenClosureInFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/open_closure_in_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("local", output[0].trim());
    }

    @Test
    @DisplayName("reference_closure_multiple_times.wx")
    void testReferenceClosureMultipleTimes() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/reference_closure_multiple_times.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
		assertEquals("a", output[1].trim());
    }

    @Test
    @DisplayName("reuse_closure_slot.wx")
    void testReuseClosureSlot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/reuse_closure_slot.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
    }

    @Test
    @DisplayName("shadow_closure_with_local.wx")
    void testShadowClosureWithLocal() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/shadow_closure_with_local.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("closure", output[0].trim());
		assertEquals("shadow", output[1].trim());
		assertEquals("closure", output[2].trim());
    }

    @Test
    @DisplayName("unused_closure.wx")
    void testUnusedClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/unused_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("ok", output[0].trim());
    }

    @Test
    @DisplayName("unused_later_closure.wx")
    void testUnusedLaterClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/closure/unused_later_closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
    }
}
