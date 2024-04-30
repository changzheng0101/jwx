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

    @Test
    @DisplayName("add.wx")
    void testAdd() throws IOException {
    }

    @Test
    @DisplayName("add_bool_nil.wx")
    void testAddBoolNil() throws IOException {
    }

    @Test
    @DisplayName("add_bool_num.wx")
    void testAddBoolNum() throws IOException {
    }

    @Test
    @DisplayName("add_bool_string.wx")
    void testAddBoolString() throws IOException {
    }

    @Test
    @DisplayName("add_nil_nil.wx")
    void testAddNilNil() throws IOException {
    }

    @Test
    @DisplayName("add_num_nil.wx")
    void testAddNumNil() throws IOException {
    }

    @Test
    @DisplayName("add_string_nil.wx")
    void testAddStringNil() throws IOException {
    }

    @Test
    @DisplayName("comparison.wx")
    void testComparison() throws IOException {
    }

    @Test
    @DisplayName("divide.wx")
    void testDivide() throws IOException {
    }

    @Test
    @DisplayName("divide_nonnum_num.wx")
    void testDivideNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("divide_num_nonnum.wx")
    void testDivideNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("equals.wx")
    void testEquals() throws IOException {
    }

    @Test
    @DisplayName("equals_class.wx")
    void testEqualsClass() throws IOException {
    }

    @Test
    @DisplayName("equals_method.wx")
    void testEqualsMethod() throws IOException {
    }

    @Test
    @DisplayName("greater_nonnum_num.wx")
    void testGreaterNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("greater_num_nonnum.wx")
    void testGreaterNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("greater_or_equal_nonnum_num.wx")
    void testGreaterOrEqualNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("greater_or_equal_num_nonnum.wx")
    void testGreaterOrEqualNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("less_nonnum_num.wx")
    void testLessNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("less_num_nonnum.wx")
    void testLessNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("less_or_equal_nonnum_num.wx")
    void testLessOrEqualNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("less_or_equal_num_nonnum.wx")
    void testLessOrEqualNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("multiply.wx")
    void testMultiply() throws IOException {
    }

    @Test
    @DisplayName("multiply_nonnum_num.wx")
    void testMultiplyNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("multiply_num_nonnum.wx")
    void testMultiplyNumNonnum() throws IOException {
    }

    @Test
    @DisplayName("negate.wx")
    void testNegate() throws IOException {
    }

    @Test
    @DisplayName("negate_nonnum.wx")
    void testNegateNonnum() throws IOException {
    }

    @Test
    @DisplayName("not.wx")
    void testNot() throws IOException {
    }

    @Test
    @DisplayName("not_class.wx")
    void testNotClass() throws IOException {
    }

    @Test
    @DisplayName("not_equals.wx")
    void testNotEquals() throws IOException {
    }

    @Test
    @DisplayName("subtract.wx")
    void testSubtract() throws IOException {
    }

    @Test
    @DisplayName("subtract_nonnum_num.wx")
    void testSubtractNonnumNum() throws IOException {
    }

    @Test
    @DisplayName("subtract_num_nonnum.wx")
    void testSubtractNumNonnum() throws IOException {
    }
}
