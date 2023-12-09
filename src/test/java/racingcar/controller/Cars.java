package racingcar.controller;

import static racingcar.util.Random.getMoveNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    private int getWinnerDistance() {
        Car fastCar = racingCars.stream().max(Comparator.comparing(Car::getDistance)).orElseThrow();
        return fastCar.getDistance();
    }

    public List<Car> getWinners() {
        int winningDistance = getWinnerDistance();
        return racingCars.stream().filter(car -> car.getDistance() >= winningDistance).collect(Collectors.toList());
    }
}
