package by.itstep.goutor.javatask.stage10.task.task9.util;

public class PositiveMoney {
    public static int getPositiveDigit(int userStartMoney) {

        return userStartMoney > 0 ? userStartMoney : -userStartMoney;
    }

}
