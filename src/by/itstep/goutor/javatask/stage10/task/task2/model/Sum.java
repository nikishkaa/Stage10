package by.itstep.goutor.javatask.stage10.task.task2.model;

public class Sum {
    public static int getSum(int userDigit) {
        int sum = 0;

        while (userDigit > 0) {
            sum += userDigit % 10;
            userDigit /= 10;
        }

        return sum;
    }
}
