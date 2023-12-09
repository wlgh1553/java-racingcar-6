package racingcar.controller;

import static racingcar.util.Random.getMoveNumber;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> racingCars;

    public Cars(List<String> carNames) {
        racingCars = new ArrayList<>();
        carNames.forEach(carName -> {
            racingCars.add(new Car(carName));
        });
    }

    public void update() {
        racingCars.forEach(car -> car.move(getMoveNumber()));
    }
}
