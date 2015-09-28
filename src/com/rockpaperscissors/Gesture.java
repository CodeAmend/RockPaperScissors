package com.rockpaperscissors;
import static com.rockpaperscissors.Status.*;
/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK, PAPER, SCISSORS;

    public Status attacks(Gesture gesture) {
        if (this == ROCK && gesture == SCISSORS ||
            this == SCISSORS && gesture == PAPER ||
            this == PAPER && gesture == ROCK ) {
            return TIE;
        } else if(this.equals(gesture)){
            return TIE;
        } else {
            return LOSE;
        }
    }
}
