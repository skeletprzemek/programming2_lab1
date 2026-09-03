/*
Part A: Answers
A1: "true" on four separate lines.
A2: To return an index of a character to be able to identify whether it's upper case, lower case or a digit.
A3: Because the index starts counting at zero, the number of indexes will always be n of characters - 1.
A4: We would get the NullPointerException because we cannot invoke String.length() because password is null.
A5: No. "VANIER2026" doesn't contain any lower case characters, which makes the Character.isLowerCase() condition false. In result, upper && lower && digit condition would be false, because if one condition is false the whole thing is considered false.
A6: No. As in question 5, "vanier2026" doesn't contain any upper case characters, which makes 2 conditions false and does not pass the test.

Part B: Answers
A1: Initially, the accumulator should be at zero.
A2: The condition if(Character.isDigit(c));
A3: After the loop is finished and it reaches the end of the text.

Part C: Answers
A1: Because it is simpler and more efficientto check if the password even has required symbols than counting them not knowing if they are present.

Part D: Answers
A1: Expected result - 1, 6, 0, 2, 0
*/
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    String password = "Vanier2026";
    System.out.println(checkPassword(password));
    System.out.println(countDigits(password));
    System.out.println(countUppercase(password));
    System.out.println(generateCode());
    }
    public static boolean checkPassword(String password){

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }
    
            /*
            System.out.println(upper);
            System.out.println(lower);
            System.out.println(digit);
            System.out.println(upper && lower && digit);
            */
            return upper && lower && digit;
    }
    public static int countDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c))
                count++;
        }
        return count;
    }
    public static boolean isValidPassword(String password){
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean isValid = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                upper = true;
            else if (Character.isLowerCase(c))
                lower = true;
            else if (Character.isDigit(c))
                digit = true;
        }
        isValid = upper && lower && digit && password.length() >= 7;
        return isValid;

    }
    public static int countUppercase(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
        if (Character.isUpperCase(password.charAt(i)))
            count++;
    }
        return count;
}
public static String generateCode(){     /* finish Up */
    String allowed = "ABCDE";
    String result = "";
    Random rand = new Random();
    for (int i = 0; i < 4; i++) {
        result = result + allowed.charAt(rand.nextInt(5));
    }
    return result;
}
}


