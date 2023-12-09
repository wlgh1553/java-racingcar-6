package racingcar.controller;

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
    }

    private void playRace() {
        Outputs.showResultMessage();
        for (int round = 0; round < racingTime; round++) {
            racingCars.update();
            Outputs.showCarsDistance(racingCars.raceResult());
        }
    }

    private void showWinner() {

    }
}
