/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK, PAPER, SCISSORS;

    public boolean beats(Gesture gesture) {
        if (this == ROCK && gesture == SCISSORS ||
            this == SCISSORS && gesture == PAPER ||
            this == PAPER && gesture == ROCK ) {
            return true;
        } else {
            return false;
        }
    }


}
