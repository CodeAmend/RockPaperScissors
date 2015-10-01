package rockpaperscissors;

import java.util.Arrays;
import java.util.Random;
/**
 * Created by codeamend on 9/30/15.
 */


public enum Gesture {

    ROCK(1), PAPER(2), SCISSORS(3), SPOCK(4), LIZARD(5);

    private int rank;
    static Random rand = new Random();

    Gesture(int rank) {
        this.rank = rank;
    }

    public boolean beats(Gesture opponents) {
        return ((this.rank - opponents.rank + 3) % 3 == 1);
    }

    public static Gesture getRandomGesture() {
        int gesturePick = rand.nextInt(Gesture.values().length);
        return Arrays.asList(Gesture.values()).get(gesturePick);
    }
}
