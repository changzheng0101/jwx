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

public class OperatorTest {
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
    @DisplayName("add.wx")
    void testAdd() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("579", output[0].trim());
		assertEquals("string", output[1].trim());
    }

    @Test
    @DisplayName("add_bool_nil.wx")
    void testAddBoolNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_bool_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("add_bool_num.wx")
    void testAddBoolNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_bool_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("add_bool_string.wx")
    void testAddBoolString() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_bool_string.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("add_nil_nil.wx")
    void testAddNilNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_nil_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("add_num_nil.wx")
    void testAddNumNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_num_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("add_string_nil.wx")
    void testAddStringNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/add_string_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("comparison.wx")
    void testComparison() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/comparison.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("false", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
		assertEquals("true", output[4].trim());
		assertEquals("false", output[5].trim());
		assertEquals("false", output[6].trim());
		assertEquals("false", output[7].trim());
		assertEquals("true", output[8].trim());
		assertEquals("false", output[9].trim());
		assertEquals("true", output[10].trim());
		assertEquals("true", output[11].trim());
		assertEquals("false", output[12].trim());
		assertEquals("false", output[13].trim());
		assertEquals("false", output[14].trim());
		assertEquals("false", output[15].trim());
		assertEquals("true", output[16].trim());
		assertEquals("true", output[17].trim());
		assertEquals("true", output[18].trim());
		assertEquals("true", output[19].trim());
    }

    @Test
    @DisplayName("divide.wx")
    void testDivide() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/divide.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("4", output[0].trim());
		assertEquals("1", output[1].trim());
    }

    @Test
    @DisplayName("divide_nonnum_num.wx")
    void testDivideNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/divide_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("divide_num_nonnum.wx")
    void testDivideNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/divide_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("equals.wx")
    void testEquals() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/equals.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("true", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
		assertEquals("false", output[4].trim());
		assertEquals("true", output[5].trim());
		assertEquals("false", output[6].trim());
		assertEquals("false", output[7].trim());
		assertEquals("false", output[8].trim());
		assertEquals("false", output[9].trim());
    }

    @Test
    @DisplayName("equals_class.wx")
    void testEqualsClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/equals_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("false", output[1].trim());
		assertEquals("false", output[2].trim());
		assertEquals("true", output[3].trim());
		assertEquals("false", output[4].trim());
		assertEquals("false", output[5].trim());
		assertEquals("false", output[6].trim());
		assertEquals("false", output[7].trim());
    }

    @Test
    @DisplayName("equals_method.wx")
    void testEqualsMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/equals_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("true", output[0].trim());
		assertEquals("false", output[1].trim());
    }

    @Test
    @DisplayName("greater_nonnum_num.wx")
    void testGreaterNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/greater_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("greater_num_nonnum.wx")
    void testGreaterNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/greater_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("greater_or_equal_nonnum_num.wx")
    void testGreaterOrEqualNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/greater_or_equal_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("greater_or_equal_num_nonnum.wx")
    void testGreaterOrEqualNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/greater_or_equal_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("less_nonnum_num.wx")
    void testLessNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/less_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("less_num_nonnum.wx")
    void testLessNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/less_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("less_or_equal_nonnum_num.wx")
    void testLessOrEqualNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/less_or_equal_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("less_or_equal_num_nonnum.wx")
    void testLessOrEqualNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/less_or_equal_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("multiply.wx")
    void testMultiply() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/multiply.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("15", output[0].trim());
		assertEquals("3.702", output[1].trim());
    }

    @Test
    @DisplayName("multiply_nonnum_num.wx")
    void testMultiplyNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/multiply_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("multiply_num_nonnum.wx")
    void testMultiplyNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/multiply_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("negate.wx")
    void testNegate() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/negate.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("-3", output[0].trim());
		assertEquals("3", output[1].trim());
		assertEquals("-3", output[2].trim());
    }

    @Test
    @DisplayName("negate_nonnum.wx")
    void testNegateNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/negate_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("not.wx")
    void testNot() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/not.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("true", output[1].trim());
		assertEquals("true", output[2].trim());
		assertEquals("false", output[3].trim());
		assertEquals("false", output[4].trim());
		assertEquals("true", output[5].trim());
		assertEquals("false", output[6].trim());
		assertEquals("false", output[7].trim());
    }

    @Test
    @DisplayName("not_class.wx")
    void testNotClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/not_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("false", output[1].trim());
    }

    @Test
    @DisplayName("not_equals.wx")
    void testNotEquals() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/not_equals.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("false", output[0].trim());
		assertEquals("false", output[1].trim());
		assertEquals("true", output[2].trim());
		assertEquals("false", output[3].trim());
		assertEquals("true", output[4].trim());
		assertEquals("false", output[5].trim());
		assertEquals("true", output[6].trim());
		assertEquals("true", output[7].trim());
		assertEquals("true", output[8].trim());
		assertEquals("true", output[9].trim());
    }

    @Test
    @DisplayName("subtract.wx")
    void testSubtract() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/subtract.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("1", output[0].trim());
		assertEquals("0", output[1].trim());
    }

    @Test
    @DisplayName("subtract_nonnum_num.wx")
    void testSubtractNonnumNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/subtract_nonnum_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("subtract_num_nonnum.wx")
    void testSubtractNumNonnum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/operator/subtract_num_nonnum.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
