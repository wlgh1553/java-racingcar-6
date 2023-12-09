package racingcar.util;

import java.util.ArrayList;
import java.util.List;

public class Validation {
    public static List<String> validNames(String input) {
        List<String> names = new ArrayList<>();
        names = new ArrayList<>(List.of(input.split(",", -1)));
        return names;
    }

    public static int validTryTime(String input) {
        try {
            int tryTime = Integer.parseInt(input);
            checkNumberRange(tryTime);
            return tryTime;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkNumberRange(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
