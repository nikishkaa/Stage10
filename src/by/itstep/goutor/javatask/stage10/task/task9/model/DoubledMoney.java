package by.itstep.goutor.javatask.stage10.task.task9.model;

public class DoubledMoney {

    public static int getMonth(int positiveStartMoney, double realPercentDigit) {

        int month = 0;
        double tempMoney = 0;

        while (tempMoney < positiveStartMoney) {
            tempMoney += (positiveStartMoney * realPercentDigit);

            month++;

        }


        return month;
    }
}
