package by.itstep.goutor.javatask.stage10.task.task10.model;

public class IncreasingSequence {
    public static final int MIN_NUMBER = -1;

    public static boolean getSequenceIncreasing(int positiveDigit) {

        int preDigit = MIN_NUMBER;

        while (positiveDigit > 0) {

            int currentDigit = positiveDigit % 10;

            if (preDigit > currentDigit) {
                return true;
            }

            preDigit = currentDigit;
            positiveDigit /= 10;

        }

        return false;
    }
}
