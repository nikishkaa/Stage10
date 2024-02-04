package by.itstep.goutor.javatask.stage10.util.digit;

import by.itstep.goutor.javatask.stage10.util.view.Printer;

import java.util.Scanner;

public class UserInitialization {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserDigit() {
        Printer.print("Enter your digit: ");
        return SCANNER.nextInt();
    }
}
