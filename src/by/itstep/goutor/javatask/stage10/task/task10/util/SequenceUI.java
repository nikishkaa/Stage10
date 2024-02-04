package by.itstep.goutor.javatask.stage10.task.task10.util;

public class SequenceUI {
    public static String getSequenceUI(boolean sequence) {

        String increaseSequence = "digits of numbers in ascending order.";
        String notIncreaseSequence = "digits of the number are NOT" +
                " in ascending order.";

        return sequence ? increaseSequence : notIncreaseSequence;
    }
}
