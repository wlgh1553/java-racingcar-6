package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;
import racingcar.util.Validation;

public class Inputs {
    public static List<String> getNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Validation.validNames(readLine());
    }

    public static int getTryTime() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Validation.validTryTime(readLine());
    }
}
