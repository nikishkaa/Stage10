package by.itstep.goutor.javatask.stage10.task.task11.model;

public class Palindrome {
    public static boolean getPalindromeDigit(int positiveDigit) {

        int originalNumber = positiveDigit;
        int reverseNumber = 0;


        while (positiveDigit > 0) {
            reverseNumber = reverseNumber * 10 + positiveDigit % 10;
            positiveDigit /= 10;
            if (originalNumber == reverseNumber) {
                return true;
            }
        }

        return false;
    }
}
