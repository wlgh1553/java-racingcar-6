package racingcar.util;

import java.util.ArrayList;
import java.util.List;

public class Validation {
    public static List<String> validNames(String input) {
        List<String> names = new ArrayList<>();
        names = new ArrayList<>(List.of(input.split(",", -1)));
        return names;
    }
}
