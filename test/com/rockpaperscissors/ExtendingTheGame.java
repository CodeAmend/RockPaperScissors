package com.rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static com.rockpaperscissors.Gesture.*;

/**
 * Created by codeamend on 9/30/15.
 */
public class ExtendingTheGame extends Assert {

    @Test
    public void does_random_work_with_lizard() {
        Set<Gesture> uniqueGestureContainer = new HashSet<>();
        for(int i = 0; i < 500; i++) {
            uniqueGestureContainer.add(Gesture.random());
        }
        Assert.assertTrue(uniqueGestureContainer.contains(LIZARD));
        Assert.assertTrue(uniqueGestureContainer.contains(ROCK));
        Assert.assertTrue(uniqueGestureContainer.contains(PAPER));
        Assert.assertTrue(uniqueGestureContainer.contains(SCISSORS));
    }

    @Test
    public void does_lizard_beat_paper() {
        assertTrue(LIZARD.beats(PAPER));
    }
    @Test
    public void does_scissors_beat_lizard() {
        assertTrue(SCISSORS.beats(LIZARD));
    }

}
