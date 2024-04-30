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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("empty.wx")
    void testEmpty() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/empty.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo", output[0].trim());
    }

    @Test
    @DisplayName("inherited_method.wx")
    void testInheritedMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/inherited_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("in foo", output[0].trim());
		assertEquals("in bar", output[1].trim());
		assertEquals("in baz", output[2].trim());
    }

    @Test
    @DisplayName("inherit_self.wx")
    void testInheritSelf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/inherit_self.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("local_inherit_other.wx")
    void testLocalInheritOther() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/local_inherit_other.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("B", output[0].trim());
    }

    @Test
    @DisplayName("local_inherit_self.wx")
    void testLocalInheritSelf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/local_inherit_self.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("local_reference_self.wx")
    void testLocalReferenceSelf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/local_reference_self.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo", output[0].trim());
    }

    @Test
    @DisplayName("reference_self.wx")
    void testReferenceSelf() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/class/reference_self.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("Foo", output[0].trim());
    }
}
