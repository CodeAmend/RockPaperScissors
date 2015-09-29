package com.rockpaperscissors;

import java.util.Random;

/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK(1, 3), PAPER(2, 1), SCISSORS(3, 2);

    private int gestureNumber, losesTo;

    Gesture(int thisNumber, int losesTo) {
        this.gestureNumber = thisNumber;
        this.losesTo = losesTo;
    }

    public boolean beats(Gesture gesture) {
        if(this.losesTo == gesture.gestureNumber) {
            return false;
        }
        return true;
    }

    public static Gesture random() {
        Random rand = new Random();
        int pick = rand.nextInt(Gesture.values().length);
        return ROCK;
    }
}
