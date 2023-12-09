package racingcar.model;

public class Car {
    private static String BASH = "-";
    private static int MAX_NAME_LENGTH = 5;
    private String name;
    private int distance;

    public Car(String name) {
        validCarName(name);
        this.name = name;
        distance = 0;
    }

    public String getCarName() {
        return name;
    }

    private void validCarName(String name) {
        if (!checkNameLength(name.trim().length())) {
            throw new IllegalArgumentException();
        }
    }

    private boolean checkNameLength(int nameLength) {
        return nameLength >= 1 && nameLength <= MAX_NAME_LENGTH;
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
