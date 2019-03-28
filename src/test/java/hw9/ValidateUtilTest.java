package hw9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateUtilTest {


    @Test
    public void isValidPhoneNumber() {
        assertTrue(ValidateUtil.isValidPhoneNumber("+380974929758"));
        assertTrue(ValidateUtil.isValidPhoneNumber("380974929758"));
        assertFalse(ValidateUtil.isValidPhoneNumber("+38097492975h"));
    }

    @Test
    public void isValidEmail() {
        assertTrue(ValidateUtil.isValidEmail("ann.shcherbyna@gmail.com"));
        assertTrue(ValidateUtil.isValidEmail("ANN.shcherbyna123@gmail.com"));
        assertTrue(ValidateUtil.isValidEmail("123.sh@g.c"));
        assertFalse(ValidateUtil.isValidEmail("@gmail.com"));
        assertFalse(ValidateUtil.isValidEmail("ann.shcherbynagmail.com"));
        assertFalse(ValidateUtil.isValidEmail("ann.shcherbyna@@gmail.com"));
        assertFalse(ValidateUtil.isValidEmail("ann.shc&herbyna@gmail.com"));
    }

    @Test
    public void isValidDate() {
        assertTrue(ValidateUtil.isValidDate("01.01.2000"));
        assertFalse(ValidateUtil.isValidDate("01.0a.2000"));
    }

    @Test
    public void isValidIp() {
        assertTrue(ValidateUtil.isValidIp("1.1.1.1"));
        assertTrue(ValidateUtil.isValidIp("123.123.123.154"));
        assertFalse(ValidateUtil.isValidIp("1aa.1.1.1"));
    }
}
