package com.rockpaperscissors;

import java.util.*;

/**
 * Created by codeamend on 9/28/15.
 */
public enum Gesture {

    ROCK(1, new Integer[] {2,4}), PAPER(2, new Integer[] {1,5}), SCISSORS(3, new Integer[]{2,4}),
    LIZARD(4, new Integer[]{2}), SPOCK(5, new Integer[] {1,3});

    private static Random random = new Random();
    private int ID;
    private Integer[] beatableIDs;
    private static List<Gesture>
            gestureList = new ArrayList<>(Arrays.asList(Gesture.values()));

    Gesture(int thisNumber, Integer[] beatableID) {
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

