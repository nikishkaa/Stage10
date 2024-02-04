package by.itstep.goutor.javatask.stage10.task.task4.model;

public class Searcher {
    public static final int SEARCH_NUMBER = 1;

    public static int search(int positiveDigit) {
        int count = 0;


        while (positiveDigit > 0) {
            int currentDigit = positiveDigit % 10;
            positiveDigit /= 10;

            if (currentDigit == SEARCH_NUMBER) {
                count += 1;
            }


        }


        return count;
    }

}
