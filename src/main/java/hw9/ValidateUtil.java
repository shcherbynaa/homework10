package hw9;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {

    private final static Logger log = Logger.getLogger(ValidateUtil.class.getName());

    private final static String PHONE_NUMBER_REGEX = ("^((\\+?[0-9]{12}))$");
    private final static String EMAIL_REGEX = ("^[a-zA-Z0-9]+\\.[a-zA-Z0-9]+@{1}[a-zA-Z0-9]+\\.[a-zA-Z]+$");
    private final static String DATE_REGEX = "[0-9]{2}.[0-9]{2}.[0-9]{4}$";
    private final static String IP_REGEX = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static boolean isValidIp(String ip) {
        Pattern pattern = Pattern.compile(IP_REGEX);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
