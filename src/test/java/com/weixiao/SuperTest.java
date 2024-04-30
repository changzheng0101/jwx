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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("bound_method.wx")
    void testBoundMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/bound_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("A.method(arg)", output[0].trim());
    }

    @Test
    @DisplayName("call_other_method.wx")
    void testCallOtherMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/call_other_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Derived.bar()", output[0].trim());
		assertEquals("Base.foo()", output[1].trim());
    }

    @Test
    @DisplayName("call_same_method.wx")
    void testCallSameMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/call_same_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Derived.foo()", output[0].trim());
		assertEquals("Base.foo()", output[1].trim());
    }

    @Test
    @DisplayName("closure.wx")
    void testClosure() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/closure.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Base", output[0].trim());
    }

    @Test
    @DisplayName("constructor.wx")
    void testConstructor() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/constructor.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Derived.init()", output[0].trim());
		assertEquals("Base.init(a, b)", output[1].trim());
    }

    @Test
    @DisplayName("extra_arguments.wx")
    void testExtraArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/extra_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Derived.foo()", output[0].trim());
    }

    @Test
    @DisplayName("indirectly_inherited.wx")
    void testIndirectlyInherited() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/indirectly_inherited.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("C.foo()", output[0].trim());
		assertEquals("A.foo()", output[1].trim());
    }

    @Test
    @DisplayName("missing_arguments.wx")
    void testMissingArguments() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/missing_arguments.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("no_superclass_bind.wx")
    void testNoSuperclassBind() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/no_superclass_bind.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("no_superclass_call.wx")
    void testNoSuperclassCall() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/no_superclass_call.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("no_superclass_method.wx")
    void testNoSuperclassMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/no_superclass_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("parenthesized.wx")
    void testParenthesized() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/parenthesized.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("reassign_superclass.wx")
    void testReassignSuperclass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/reassign_superclass.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Base.method()", output[0].trim());
		assertEquals("Base.method()", output[1].trim());
    }

    @Test
    @DisplayName("super_at_top_level.wx")
    void testSuperAtTopLevel() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_at_top_level.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("super_in_closure_in_inherited_method.wx")
    void testSuperInClosureInInheritedMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_in_closure_in_inherited_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("A", output[0].trim());
    }

    @Test
    @DisplayName("super_in_inherited_method.wx")
    void testSuperInInheritedMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_in_inherited_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("A", output[0].trim());
    }

    @Test
    @DisplayName("super_in_top_level_function.wx")
    void testSuperInTopLevelFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_in_top_level_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("super_without_dot.wx")
    void testSuperWithoutDot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_without_dot.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("super_without_name.wx")
    void testSuperWithoutName() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/super_without_name.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("this_in_superclass_method.wx")
    void testThisInSuperclassMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/super/this_in_superclass_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("a", output[0].trim());
		assertEquals("b", output[1].trim());
    }
}
