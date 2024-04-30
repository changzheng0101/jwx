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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

    @Test
    @DisplayName("call_function_field.wx")
    void testCallFunctionField() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/call_function_field.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("bar", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("2", output[2].trim());
    }

    @Test
    @DisplayName("call_nonfunction_field.wx")
    void testCallNonfunctionField() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/call_nonfunction_field.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_and_set_method.wx")
    void testGetAndSetMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_and_set_method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("other", output[0].trim());
		assertEquals("1", output[1].trim());
		assertEquals("method", output[2].trim());
		assertEquals("2", output[3].trim());
    }

    @Test
    @DisplayName("get_on_bool.wx")
    void testGetOnBool() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_bool.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_on_class.wx")
    void testGetOnClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_on_function.wx")
    void testGetOnFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_on_nil.wx")
    void testGetOnNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_on_num.wx")
    void testGetOnNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("get_on_string.wx")
    void testGetOnString() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/get_on_string.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("many.wx")
    void testMany() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/many.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("apple", output[0].trim());
		assertEquals("apricot", output[1].trim());
		assertEquals("avocado", output[2].trim());
		assertEquals("banana", output[3].trim());
		assertEquals("bilberry", output[4].trim());
		assertEquals("blackberry", output[5].trim());
		assertEquals("blackcurrant", output[6].trim());
		assertEquals("blueberry", output[7].trim());
		assertEquals("boysenberry", output[8].trim());
		assertEquals("cantaloupe", output[9].trim());
		assertEquals("cherimoya", output[10].trim());
		assertEquals("cherry", output[11].trim());
		assertEquals("clementine", output[12].trim());
		assertEquals("cloudberry", output[13].trim());
		assertEquals("coconut", output[14].trim());
		assertEquals("cranberry", output[15].trim());
		assertEquals("currant", output[16].trim());
		assertEquals("damson", output[17].trim());
		assertEquals("date", output[18].trim());
		assertEquals("dragonfruit", output[19].trim());
		assertEquals("durian", output[20].trim());
		assertEquals("elderberry", output[21].trim());
		assertEquals("feijoa", output[22].trim());
		assertEquals("fig", output[23].trim());
		assertEquals("gooseberry", output[24].trim());
		assertEquals("grape", output[25].trim());
		assertEquals("grapefruit", output[26].trim());
		assertEquals("guava", output[27].trim());
		assertEquals("honeydew", output[28].trim());
		assertEquals("huckleberry", output[29].trim());
		assertEquals("jabuticaba", output[30].trim());
		assertEquals("jackfruit", output[31].trim());
		assertEquals("jambul", output[32].trim());
		assertEquals("jujube", output[33].trim());
		assertEquals("juniper", output[34].trim());
		assertEquals("kiwifruit", output[35].trim());
		assertEquals("kumquat", output[36].trim());
		assertEquals("lemon", output[37].trim());
		assertEquals("lime", output[38].trim());
		assertEquals("longan", output[39].trim());
		assertEquals("loquat", output[40].trim());
		assertEquals("lychee", output[41].trim());
		assertEquals("mandarine", output[42].trim());
		assertEquals("mango", output[43].trim());
		assertEquals("marionberry", output[44].trim());
		assertEquals("melon", output[45].trim());
		assertEquals("miracle", output[46].trim());
		assertEquals("mulberry", output[47].trim());
		assertEquals("nance", output[48].trim());
		assertEquals("nectarine", output[49].trim());
		assertEquals("olive", output[50].trim());
		assertEquals("orange", output[51].trim());
		assertEquals("papaya", output[52].trim());
		assertEquals("passionfruit", output[53].trim());
		assertEquals("peach", output[54].trim());
		assertEquals("pear", output[55].trim());
		assertEquals("persimmon", output[56].trim());
		assertEquals("physalis", output[57].trim());
		assertEquals("pineapple", output[58].trim());
		assertEquals("plantain", output[59].trim());
		assertEquals("plum", output[60].trim());
		assertEquals("plumcot", output[61].trim());
		assertEquals("pomegranate", output[62].trim());
		assertEquals("pomelo", output[63].trim());
		assertEquals("quince", output[64].trim());
		assertEquals("raisin", output[65].trim());
		assertEquals("rambutan", output[66].trim());
		assertEquals("raspberry", output[67].trim());
		assertEquals("redcurrant", output[68].trim());
		assertEquals("salak", output[69].trim());
		assertEquals("salmonberry", output[70].trim());
		assertEquals("satsuma", output[71].trim());
		assertEquals("strawberry", output[72].trim());
		assertEquals("tamarillo", output[73].trim());
		assertEquals("tamarind", output[74].trim());
		assertEquals("tangerine", output[75].trim());
		assertEquals("tomato", output[76].trim());
		assertEquals("watermelon", output[77].trim());
		assertEquals("yuzu", output[78].trim());
    }

    @Test
    @DisplayName("method.wx")
    void testMethod() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/method.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("got method", output[0].trim());
		assertEquals("arg", output[1].trim());
    }

    @Test
    @DisplayName("method_binds_this.wx")
    void testMethodBindsThis() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/method_binds_this.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("foo1", output[0].trim());
		assertEquals("1", output[1].trim());
    }

    @Test
    @DisplayName("on_instance.wx")
    void testOnInstance() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/on_instance.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
		assertEquals("bar value", output[0].trim());
		assertEquals("baz value", output[1].trim());
		assertEquals("bar value", output[2].trim());
		assertEquals("baz value", output[3].trim());
    }

    @Test
    @DisplayName("set_evaluation_order.wx")
    void testSetEvaluationOrder() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_evaluation_order.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_bool.wx")
    void testSetOnBool() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_bool.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_class.wx")
    void testSetOnClass() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_class.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_function.wx")
    void testSetOnFunction() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_function.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_nil.wx")
    void testSetOnNil() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_nil.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_num.wx")
    void testSetOnNum() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_num.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("set_on_string.wx")
    void testSetOnString() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/set_on_string.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }

    @Test
    @DisplayName("undefined.wx")
    void testUndefined() throws Exception {
		String[] args = {"E:/code/OS/my_own_language/jwx/src/test/java/files/field/undefined.wx"};
		int statusCode = catchSystemExit(() -> Wx.main(args));
		String[] output = standardOutputStreamCaptor.toString().split(lineSeparator);
    }
}
