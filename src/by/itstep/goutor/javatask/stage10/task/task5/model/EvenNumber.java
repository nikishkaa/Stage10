package by.itstep.goutor.javatask.stage10.task.task5.model;

public class EvenNumber {
    public static int getCountEvenNumber(int positiveDigit) {
        int count = 0;

        while (positiveDigit > 0) {
            int tempMeaning = positiveDigit % 10;
            positiveDigit /= 10;
            if (tempMeaning % 2 == 0 && tempMeaning != 0) {
                count += 1;
            }
        }


        return count;
    }
}
