/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK, PAPER, SCISSORS;

    public boolean beats(Gesture gesture) {
        if(PAPER == gesture) {
            return false;
        }
        return true;
    }

}
