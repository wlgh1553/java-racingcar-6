package racingcar;

import racingcar.controller.MainController;

public class Application {
    public static void main(String[] args) {
        MainController racingGameManager = new MainController();
        racingGameManager.run();
    }
}
