package by.itstep.goutor.javatask.stage10.task.task2.controller;

import by.itstep.goutor.javatask.stage10.task.task2.model.Sum;
import by.itstep.goutor.javatask.stage10.task.task2.util.UserUI;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();

        int sum = Sum.getSum(userDigit);

        Printer.print(UserUI.getUserUI(sum));
    }
}
