package racingcar.view;

import java.util.List;

public class Outputs {
    public static void showResultMessage() {
        System.out.println("\n실행 결과");
    }

    public static void showCarsDistance(List<String> results) {
        results.forEach(System.out::println);
        System.out.println();
    }
}
