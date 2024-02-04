package by.itstep.goutor.javatask.stage10.task.task3.controller;

import by.itstep.goutor.javatask.stage10.task.task3.model.SimilarNumber;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.task.task3.util.UserUI;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();

        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        boolean msg = SimilarNumber.similarNumberOrNot(positiveDigit);

        Printer.print(UserUI.getUserUI(msg));
    }
}
