package by.itstep.goutor.javatask.stage10.task.task6.model;

public class SameParity {
    public static boolean getSameParityNumber(int positiveDigit) {

        while (positiveDigit > 0) {
            int tempDigit = positiveDigit % 10;
            positiveDigit /= 10;

            if (tempDigit % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
