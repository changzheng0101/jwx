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

public class FieldTest {
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
    @DisplayName("call_function_field.wx")
    void testCallFunctionField() throws IOException {
    }

    @Test
    @DisplayName("call_nonfunction_field.wx")
    void testCallNonfunctionField() throws IOException {
    }

    @Test
    @DisplayName("get_and_set_method.wx")
    void testGetAndSetMethod() throws IOException {
    }

    @Test
    @DisplayName("get_on_bool.wx")
    void testGetOnBool() throws IOException {
    }

    @Test
    @DisplayName("get_on_class.wx")
    void testGetOnClass() throws IOException {
    }

    @Test
    @DisplayName("get_on_function.wx")
    void testGetOnFunction() throws IOException {
    }

    @Test
    @DisplayName("get_on_nil.wx")
    void testGetOnNil() throws IOException {
    }

    @Test
    @DisplayName("get_on_num.wx")
    void testGetOnNum() throws IOException {
    }

    @Test
    @DisplayName("get_on_string.wx")
    void testGetOnString() throws IOException {
    }

    @Test
    @DisplayName("many.wx")
    void testMany() throws IOException {
    }

    @Test
    @DisplayName("method.wx")
    void testMethod() throws IOException {
    }

    @Test
    @DisplayName("method_binds_this.wx")
    void testMethodBindsThis() throws IOException {
    }

    @Test
    @DisplayName("on_instance.wx")
    void testOnInstance() throws IOException {
    }

    @Test
    @DisplayName("set_evaluation_order.wx")
    void testSetEvaluationOrder() throws IOException {
    }

    @Test
    @DisplayName("set_on_bool.wx")
    void testSetOnBool() throws IOException {
    }

    @Test
    @DisplayName("set_on_class.wx")
    void testSetOnClass() throws IOException {
    }

    @Test
    @DisplayName("set_on_function.wx")
    void testSetOnFunction() throws IOException {
    }

    @Test
    @DisplayName("set_on_nil.wx")
    void testSetOnNil() throws IOException {
    }

    @Test
    @DisplayName("set_on_num.wx")
    void testSetOnNum() throws IOException {
    }

    @Test
    @DisplayName("set_on_string.wx")
    void testSetOnString() throws IOException {
    }

    @Test
    @DisplayName("undefined.wx")
    void testUndefined() throws IOException {
    }
}
