package by.itstep.goutor.javatask.stage10.task.task12.controller;

import by.itstep.goutor.javatask.stage10.task.task12.model.ReverseNumber;
import by.itstep.goutor.javatask.stage10.task.task12.util.ReverseUI;
import by.itstep.goutor.javatask.stage10.util.digit.UserInitialization;
import by.itstep.goutor.javatask.stage10.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        int userDigit = UserInitialization.getUserDigit();

        int reverseNumber = ReverseNumber.getReverseNumber(userDigit);


        Printer.print(ReverseUI.getReverseNumberUI(reverseNumber));
    }
}
