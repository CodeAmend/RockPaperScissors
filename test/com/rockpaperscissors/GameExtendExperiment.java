package com.rockpaperscissors;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.rockpaperscissors.Gesture.*;

/**
 * Created by codeamend on 9/29/15.
 */
public class GameExtendExperiment extends Assert {

    @Test
    public void gestureConstructorValues() {

        Gesture computer = SCISSORS;
        Gesture myPick = ROCK;

        assertTrue(computer.beats(myPick));
        assertFalse(myPick.beats(computer));

    }

    static List<Gesture> gList;
    static void init(Gesture testPick) {
        gList = new ArrayList<>(Arrays.asList(testPick));
        for(int i = 0; !gList.isEmpty() && i < 100; i++) {
            if(Gesture.random() == testPick) {
                gList.remove(testPick);
            }
        }
    }
    @Test
    public void removeSwitchRockTrial() {
        init(ROCK);
        assertTrue(gList.isEmpty());
    }
    @Test
    public void removeSwitchScissorsTrial() {
        init(SCISSORS);
        assertTrue(gList.isEmpty());
    }

    @Test
    public void removeSwitchPaperTrial() {
        init(PAPER);
        assertTrue(gList.isEmpty());
    }


}
