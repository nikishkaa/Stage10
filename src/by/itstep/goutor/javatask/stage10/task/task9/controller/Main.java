package by.itstep.goutor.javatask.stage10.task.task9.controller;

import by.itstep.goutor.javatask.stage10.task.task9.model.DoubledMoney;
import by.itstep.goutor.javatask.stage10.task.task9.util.*;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int userStartMoney = UserStartMoney.getUserDigit();
        int positiveStartMoney = PositiveMoney.getPositiveDigit(userStartMoney);

        int userPercent = UserPercent.getUserDigit();
        int positivePercent = PositivePercent.getPositiveDigit(userPercent);
        double realPercentDigit = PercentInDigit.getRealNumber(positivePercent);

        int month = DoubledMoney.getMonth(positiveStartMoney, realPercentDigit);


        Printer.print(UserUI.getUserUI(month));
    }

}
