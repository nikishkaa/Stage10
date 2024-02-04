package by.itstep.goutor.javatask.stage10.task.task13.model;

public class VariousNumberDigits {
    public static boolean getVariousNumberDigits(int positiveDigits) {

        while (positiveDigits > 0) {
            int lastDigit = positiveDigits % 10;
            positiveDigits /= 10;
            int currentDigit = positiveDigits % 10;

            if (lastDigit == currentDigit) {
                return false;
            }

        }


        return true;
    }

}
