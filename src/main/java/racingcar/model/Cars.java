package racingcar.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import racingcar.util.Random;

public class Cars {
    private List<Car> racingCars;

    public Cars(List<String> carNames) {
        validCarNames(carNames);
        racingCars = new ArrayList<>();
        carNames.forEach(carName -> {
            racingCars.add(new Car(carName));
        });
    }

    private void validCarNames(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>(carNames);
        if (uniqueNames.size() != carNames.size()) {
            throw new IllegalArgumentException();
        }
    }

    public void update() {
        racingCars.forEach(car -> car.move(Random.getMoveNumber()));
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
