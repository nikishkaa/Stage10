package by.itstep.goutor.javatask.stage10.task.task10.controller;

import by.itstep.goutor.javatask.stage10.task.task10.model.IncreasingSequence;
import by.itstep.goutor.javatask.stage10.task.task10.util.SequenceUI;
import by.itstep.goutor.javatask.stage10.util.digit.NegativeToPositive;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int userDigit = UserInitialization.getUserDigit();
        int positiveDigit = NegativeToPositive.getPositiveDigit(userDigit);

        boolean sequence = IncreasingSequence.getSequenceIncreasing(positiveDigit);

        Printer.print(SequenceUI.getSequenceUI(sequence));

    }
}
