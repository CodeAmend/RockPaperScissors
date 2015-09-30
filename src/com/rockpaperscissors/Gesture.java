package com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK(1, 3), PAPER(2, 1), SCISSORS(3, 2), LIZARD(4, 2);

    private static Random random = new Random();
    private int ID, beatlableID;
    private static List<Gesture>
            gestureList = new ArrayList<>(Arrays.asList(Gesture.values()));

    Gesture(int thisNumber, int beatableID) {
        this.ID = thisNumber;
        this.beatlableID = beatableID;
    }

    public boolean beats(Gesture gesture) {
        if(this.beatlableID == gesture.ID) {
            return true;
        }
        return false;
    }

    public static Gesture random() {
        int randomChoice = random.nextInt(Gesture.values().length);
        return gestureList.get(randomChoice);
    }
}

