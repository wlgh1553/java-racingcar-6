package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {
    public static int getMoveNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
