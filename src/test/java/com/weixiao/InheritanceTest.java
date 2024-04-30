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

public class InheritanceTest {
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
    @DisplayName("constructor.wx")
    void testConstructor() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/constructor.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("value", output[0].trim());
    }

    @Test
    @DisplayName("inherit_from_function.wx")
    void testInheritFromFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/inherit_from_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("inherit_from_nil.wx")
    void testInheritFromNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/inherit_from_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("inherit_from_number.wx")
    void testInheritFromNumber() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/inherit_from_number.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("inherit_methods.wx")
    void testInheritMethods() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/inherit_methods.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("foo", output[0].trim());
		assertEquals("bar", output[1].trim());
		assertEquals("bar", output[2].trim());
    }

    @Test
    @DisplayName("parenthesized_superclass.wx")
    void testParenthesizedSuperclass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/parenthesized_superclass.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_fields_from_base_class.wx")
    void testSetFieldsFromBaseClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/inheritance/set_fields_from_base_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("foo 1", output[0].trim());
		assertEquals("foo 2", output[1].trim());
		assertEquals("bar 1", output[2].trim());
		assertEquals("bar 2", output[3].trim());
		assertEquals("bar 1", output[4].trim());
		assertEquals("bar 2", output[5].trim());
    }
}
