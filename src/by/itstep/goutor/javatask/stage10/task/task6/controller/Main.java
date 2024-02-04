package by.itstep.goutor.javatask.stage10.task.task6.controller;

import by.itstep.goutor.javatask.stage10.task.task6.model.SameParity;
import by.itstep.goutor.javatask.stage10.task.task6.util.ParityUI;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();
        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        boolean parity = SameParity.getSameParityNumber(positiveDigit);

        Printer.print(ParityUI.getParityUI(parity));
    }
}
