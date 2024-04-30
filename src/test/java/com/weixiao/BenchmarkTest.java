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

public class BenchmarkTest {
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
    @DisplayName("binary_trees.wx")
    void testBinaryTrees() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/binary_trees.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("equality.wx")
    void testEquality() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/equality.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("fib.wx")
    void testFib() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/fib.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("instantiation.wx")
    void testInstantiation() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/instantiation.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("invocation.wx")
    void testInvocation() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/invocation.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("method_call.wx")
    void testMethodCall() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/method_call.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("properties.wx")
    void testProperties() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/properties.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("string_equality.wx")
    void testStringEquality() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/string_equality.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("trees.wx")
    void testTrees() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/trees.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("zoo.wx")
    void testZoo() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/zoo.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("zoo_batch.wx")
    void testZooBatch() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/benchmark/zoo_batch.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
