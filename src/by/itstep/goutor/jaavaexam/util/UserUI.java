package by.itstep.goutor.jaavaexam.util;

public class UserUI {
    private static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(int carCount) {
        BUILDER.append("Car in station: ").append(carCount);


        return BUILDER.toString();
    }
}
