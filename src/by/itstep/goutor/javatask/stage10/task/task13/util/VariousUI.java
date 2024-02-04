package by.itstep.goutor.javatask.stage10.task.task13.util;

public class VariousUI {
    public static String getVariousDigitUI(boolean check) {
        String msg = "All number in digit is ";

        String various = "various.";
        String notVarious = "NOT various.";


        return check ? msg + various : msg + notVarious;
    }
}
