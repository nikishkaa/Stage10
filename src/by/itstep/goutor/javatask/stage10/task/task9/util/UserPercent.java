package by.itstep.goutor.javatask.stage10.task.task9.util;

import by.itstep.goutor.javatask.stage10.util.view.Printer;

import java.util.Scanner;

public class UserPercent {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserDigit() {
        Printer.print("Enter your deposit percent(%): ");
        return SCANNER.nextInt();
    }
}
