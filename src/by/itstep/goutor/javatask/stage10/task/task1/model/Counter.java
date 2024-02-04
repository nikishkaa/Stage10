package by.itstep.goutor.javatask.stage10.task.task1.model;

public class Counter {

    public static int getNumberOfDigit(int userDigit) {

        userDigit = userDigit > 0 ? userDigit : -userDigit;

        int count = 0;

        while (userDigit > 0) {
            userDigit = userDigit / 10;
            count += 1;
        }

        return count;
    }
}
