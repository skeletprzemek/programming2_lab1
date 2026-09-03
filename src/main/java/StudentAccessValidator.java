package main.java;
import java.util.Random;

public class StudentAccessValidator {
    String id = "V123456";

    public static boolean isValidStudentId(String id) {
        boolean validId = false;
        if (id.charAt(0) != 'V')
            validId = false;
        if (id.length() != 6)
            validId = false;
        for (int i = 1; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return validId;
    }

    public static boolean isValidPassword(String password) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean validPassword = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }
        validPassword = upper && lower && digit && password.length() >= 7;
        return validPassword;
    }

    public static String generateAccessCode() {
        String allowed = "ABCDE";
        String result = "";
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            result = result + allowed.charAt(rand.nextInt(5));
        }
        return result;
    }

    public static boolean isValidAccess(String id, String password) {
        return isValidStudentId(id) && isValidPassword(password);
    }
}


