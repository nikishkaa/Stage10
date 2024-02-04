package by.itstep.goutor.javatask.stage10.task.task7.model;

public class AtLeastOneEvenDigit {
    public static boolean getAtLeastOneEvenNumberMsg(int positiveDigit) {

        while (positiveDigit > 0) {
            int tempDigit = positiveDigit % 10;
            positiveDigit /= 10;

            if (tempDigit % 2 == 0) {
                return true;
            }
        }

        return false;
    }
}
