package com.rockpaperscissors;

import java.util.*;

/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK(1, new int[3]), PAPER(2, new int[1]), SCISSORS(3, new int [2]), LIZARD(4, new int[2]);

    private static Random random = new Random();
    private int ID, beatableIDs[];
    private static List<Gesture>
            gestureList = new ArrayList<>(Arrays.asList(Gesture.values()));

    Gesture(int thisNumber, int[] beatableID) {
        this.ID = thisNumber;
        this.beatableIDs = beatableID;
    }

    public boolean beats(Gesture gesture) {
        if(Arrays.asList(beatableIDs).contains(gesture.ID)) {
            return true;
        }
        return false;
    }

    public static Gesture random() {
        int randomChoice = random.nextInt(Gesture.values().length);
        return gestureList.get(randomChoice);
    }
}

