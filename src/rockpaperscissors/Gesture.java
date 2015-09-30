package rockpaperscissors;

/**
 * Created by codeamend on 9/30/15.
 */
public enum Gesture {

    ROCK(1), PAPER(2), SCISSORS(3);

    private int rank;

    Gesture(int rank) {
        this.rank = rank;
    }

    public boolean beats(Gesture opponent) {
        if((this.rank - opponent.rank + 3) % 3 == 1)
            return true;
        return false;
    }

    public static Gesture getRandomGesture() {
        return ROCK;
    }
}
