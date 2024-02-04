package by.itstep.goutor.javatask.stage10.task.task13.controller;

import by.itstep.goutor.javatask.stage10.task.task13.model.VariousNumberDigits;
import by.itstep.goutor.javatask.stage10.task.task13.util.VariousUI;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();
        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        boolean check = VariousNumberDigits.getVariousNumberDigits(positiveDigit);


        Printer.print(VariousUI.getVariousDigitUI(check));
    }
}
