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
A3: After the loop is finished and it reavhes the end of the text.
*/

void main(){
    System.out.println(checkPassword("Vanier2026"));
    System.out.println(countDigits("Vanier2026"));
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
public static int countDigits(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (Character.isDigit(c))
            count++;
    }
    return count;
}