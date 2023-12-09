package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.Inputs;

public class MainController {
    private Cars racingCars;
    private int racingTime;

    public MainController() {
        racingCars = new Cars(Inputs.getNames());
        racingTime = Inputs.getTryTime();
    }

    public void run() {

    }
}
