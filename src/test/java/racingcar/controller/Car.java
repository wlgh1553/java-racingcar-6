package racingcar.controller;

public class Car {
    private static String BASH = "-";
    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        distance = 0;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " : " + BASH.repeat(distance);
    }

    private boolean canMove(int moveNumber) {
        return moveNumber >= 4;
    }

    public void move(int moveNumber) {
        if (canMove(moveNumber)) {
            distance += 1;
        }
    }
}
