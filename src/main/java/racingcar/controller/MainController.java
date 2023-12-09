package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.Inputs;

public class MainController {
    private Cars racingCars;

    public MainController() {
        racingCars = new Cars(Inputs.getNames());
    }

    public void run() {

    }
}
