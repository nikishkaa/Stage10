package by.itstep.goutor.javatask.stage10.task.task8.controller;

import by.itstep.goutor.javatask.stage10.task.task8.model.Majority;
import by.itstep.goutor.javatask.stage10.task.task8.util.MajorityUI;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int userDigit = UserInitialization.getUserDigit();
        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        boolean majority = Majority.getMajorityOrNo(positiveDigit);


        Printer.print(MajorityUI.getMajorityUI(majority));

    }
}
