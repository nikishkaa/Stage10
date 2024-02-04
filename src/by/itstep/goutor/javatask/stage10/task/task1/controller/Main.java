package by.itstep.goutor.javatask.stage10.task.task1.controller;

import by.itstep.goutor.javatask.stage10.task.task1.model.Counter;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.task.task1.util.UserUI;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();

        int count = Counter.getNumberOfDigit(userDigit);

        Printer.print(UserUI.getUserUI(count));
    }
}
