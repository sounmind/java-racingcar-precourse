package racingcar;

interface Participatory {
    void tryToMove(Round round, int roundNumber);
    boolean isWinner(int longestDistance);
}

public class Car implements Participatory {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void tryToMove(Round round, int roundNumber) {
        if (MovementArbiter.canMove()) {
            position++;
        }
        round.registerCarMovement(roundNumber, name, position);
    }
    public boolean isWinner(int longestDistance) {
        return position == longestDistance;
    }
}
