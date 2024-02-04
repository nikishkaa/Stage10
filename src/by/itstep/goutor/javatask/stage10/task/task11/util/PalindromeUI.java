package by.itstep.goutor.javatask.stage10.task.task11.util;

public class PalindromeUI {
    public static String getPalindromeUI(boolean palindromeDigit) {

        String msg = "Your digit is ";

        String palindrome = "palindrome";
        String notPalindrome = "not palindrome";

        return palindromeDigit ? msg + palindrome : msg + notPalindrome;





    }
}
