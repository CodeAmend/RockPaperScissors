package com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK(1, 3), PAPER(2, 1), SCISSORS(3, 2);

    private static Random random = new Random();
    private int gestureNumber, losesTo;
    private static List<Gesture>
            gestureList = new ArrayList<>(Arrays.asList(Gesture.values()));

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
        int pick = random.nextInt(Gesture.values().length);
        return gestureList.get(pick);
    }
}
