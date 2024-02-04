package by.itstep.goutor.javatask.stage10.task.task12.model;

public class ReverseNumber {
    public static int getReverseNumber(int userDigit) {

        int reverseNumber = 0;

        boolean negative = userDigit < 0;

        userDigit = Math.abs(userDigit);

        while (userDigit > 0) {
            reverseNumber = reverseNumber * 10 + userDigit % 10;
            userDigit /= 10;
        }

        reverseNumber = negative ? -reverseNumber : reverseNumber;

        return reverseNumber;
    }
}
