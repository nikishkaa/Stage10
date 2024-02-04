package by.itstep.goutor.javatask.stage10.task.task3.model;

public class SimilarNumber {
    public static boolean similarNumberOrNot(int positiveDigit) {


        int currentDigit = positiveDigit % 10;

        while (positiveDigit > 0) {
            if (currentDigit != positiveDigit % 10) {
                return false;
            }
            positiveDigit /= 10;
        }

        return true;
    }
}
