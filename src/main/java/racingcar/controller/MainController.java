package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.Inputs;
import racingcar.view.Outputs;

public class MainController {
    private Cars racingCars;
    private int racingTime;

    public MainController() {
        racingCars = new Cars(Inputs.getNames());
        racingTime = Inputs.getTryTime();
    }

    public void run() {
        playRace();
        showWinner(racingCars.getWinners());
    }

    private void playRace() {
        Outputs.showResultMessage();
        for (int round = 0; round < racingTime; round++) {
            racingCars.update();
            Outputs.showCarsDistance(racingCars.raceResult());
        }
    }

    private void showWinner(List<Car> winners) {
        List<String> names = new ArrayList<>();
        winners.forEach(e -> names.add(e.getCarName()));
        Outputs.showWinnersName(names);
    }
}
