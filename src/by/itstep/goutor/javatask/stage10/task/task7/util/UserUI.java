package by.itstep.goutor.javatask.stage10.task.task7.util;

public class UserUI {
    public static String getUserUI(boolean evenNumber) {

        String msg = "At least number is ";
        return evenNumber ? msg + "even" : msg + "odd";
    }
}
