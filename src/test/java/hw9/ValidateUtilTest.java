package hw9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateUtilTest {


    @Test
    public void isValidPhoneNumber() {
        assertEquals(true, ValidateUtil.isValidPhoneNumber("+380974929758"));
        assertEquals(false, ValidateUtil.isValidPhoneNumber("+38097492975h"));
        assertEquals(true, ValidateUtil.isValidPhoneNumber("380974929758"));
    }

    @Test
    public void isValidEmail() {
        assertEquals(true, ValidateUtil.isValidEmail("ann.shcherbyna@gmail.com"));
        assertEquals(true, ValidateUtil.isValidEmail("ANN.shcherbyna123@gmail.com"));
        assertEquals(true, ValidateUtil.isValidEmail("123.sh@g.c"));
        assertEquals(false, ValidateUtil.isValidEmail("@gmail.com"));
        assertEquals(false, ValidateUtil.isValidEmail("ann.shcherbynagmail.com"));
        assertEquals(false, ValidateUtil.isValidEmail("ann.shcherbyna@@gmail.com"));
        assertEquals(false, ValidateUtil.isValidEmail("ann.shc&herbyna@gmail.com"));
    }

    @Test
    public void isValidDate() {
        assertEquals(true, ValidateUtil.isValidDate("01.01.2000"));
        assertEquals(false, ValidateUtil.isValidDate("01.0a.2000"));
    }

    @Test
    public void isValidIp() {
        assertEquals(true, ValidateUtil.isValidIp("1.1.1.1"));
        assertEquals(true, ValidateUtil.isValidIp("123.123.123.154"));
        assertEquals(false, ValidateUtil.isValidIp("1aa.1.1.1"));
    }
}
