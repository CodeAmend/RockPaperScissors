package rockpaperscissors;

import java.util.Arrays;
import java.util.Random;
/**
 * Created by codeamend on 9/30/15.
 */


public enum Gesture {

    ROCK(1), PAPER(2), SCISSORS(3), SPOCK(4), LIZARD(5);

    private int rank;
    private static Random pick = new Random();

    Gesture(int rank) {
        this.rank = rank;
    }

    public boolean beats(Gesture opponents) {
        int moduloAlgorithm = (this.rank - opponents.rank + 5) % 5;
        return (moduloAlgorithm == 1 || moduloAlgorithm == 3);
    }

    public static Gesture getRandomGesture() {
        return values()[pick.nextInt(values().length)];
    }
}
