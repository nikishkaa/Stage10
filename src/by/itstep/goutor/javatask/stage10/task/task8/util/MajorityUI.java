package by.itstep.goutor.javatask.stage10.task.task8.util;

public class MajorityUI {
    public static String getMajorityUI(boolean majority) {

        String majorityTrue = "Even number is majority";
        String majorityFalse = "Odd number is majority";

        return majority ? majorityTrue : majorityFalse;
    }
}
