package com.rockpaperscissors;

import java.util.Random;

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

    public static Gesture random() {
        Random rand = new Random();
        int pick = rand.nextInt(3);
        switch (pick) {
            case 0 : return ROCK;
            case 1 : return PAPER;
            case 2 : return SCISSORS;
        }
        return null;
    }
}
