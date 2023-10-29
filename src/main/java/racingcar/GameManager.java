package racingcar;

import static racingcar.view.InitialInputs.readCarNames;
import static racingcar.view.InitialInputs.readExcecutionNumber;
import static racingcar.view.RacingProcess.showOneRound;
import static racingcar.view.RacingProcess.showText;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;

public class GameManager {
    private List<Car> cars = new ArrayList<>();
    private int executionNumber;

    public GameManager() {
        set();
        play();
    }

    private void set() {
        List<String> names = readCarNames();
        names.stream().forEach(name -> cars.add(new Car(name)));
        executionNumber = readExcecutionNumber();
    }

    private void play() {
        showText();
        for (int i = 0; i < executionNumber; i++) {
            updateOneRound();
            showOneRound(cars);
        }
    }

    private void updateOneRound() {
        for (Car car : cars) {
            car.updateDistance();
        }
    }
}