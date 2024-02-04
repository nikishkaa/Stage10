package by.itstep.goutor.javatask.stage10.task.task8.model;

public class Majority {
    public static boolean getMajorityOrNo(int positiveDigit) {


        while (positiveDigit > 0) {

            int tempDigit = positiveDigit % 10;
            int countEven = 0;
            int countOdd = 0;

            if (tempDigit % 2 == 0) {
                countEven += 1;
            }

            return countOdd < countEven;
        }


        return true;
    }
}
