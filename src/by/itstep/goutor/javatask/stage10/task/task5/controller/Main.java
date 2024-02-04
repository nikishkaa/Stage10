package by.itstep.goutor.javatask.stage10.task.task5.controller;

import by.itstep.goutor.javatask.stage10.task.task5.model.EvenNumber;
import by.itstep.goutor.javatask.stage10.task.task5.util.UserUI;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();
        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        int count = EvenNumber.getCountEvenNumber(positiveDigit);

        Printer.print(UserUI.getUserUI(count));
    }
}
