package com.rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static com.rockpaperscissors.Gesture.ROCK;
import static com.rockpaperscissors.Gesture.PAPER;
import static com.rockpaperscissors.Gesture.SCISSORS;

/**
 * Created by codeamend on 9/28/15.
 */
public class RPS extends Assert {

    // I have three valid moves: Rock, Paper, or Scissors.
    // The result will be either
    // a tie when the computer and I make the same move,
    // or I will win, or the computer will win.
    // Scissors cut Paper, Paper covers Rock, Rock smashes Scissors.

    Gesture myGesture;
    Gesture computer;

    @Test
    public void winningGesture() {
        assertTrue(PAPER.beats(ROCK));
        assertTrue(ROCK.beats(SCISSORS));
        assertTrue(SCISSORS.beats(PAPER));
    }


    @Test
    public void losingGesture() {
        assertFalse(ROCK.beats(PAPER));
        assertFalse(PAPER.beats(SCISSORS));
        assertFalse(SCISSORS.beats(ROCK));
    }

    @Test
    public void tieGesture() {

        myGesture = ROCK;
        computer = ROCK;
        assertTrue(myGesture.equals(computer));

        myGesture = SCISSORS;
        computer = SCISSORS;
        assertTrue(myGesture.equals(computer));

        myGesture = PAPER;
        computer = PAPER;
        assertTrue(myGesture.equals(computer));


    }

    @Test
    public void randomComputerPick() {
        List<Gesture> allGestures = new ArrayList<>(Arrays.asList(ROCK, PAPER, SCISSORS));
        for(int i = 0; !allGestures.isEmpty() && i < 500; i++) {

            Gesture next = Gesture.random();
            if(allGestures.contains(next)) {
                allGestures.remove(next);
            }
        }
        assertTrue(allGestures.isEmpty());
    }


    @Test
    public void anotherRandomComputerPick() {

        Set<Gesture> allGestures = new HashSet<>();
        for(int i = 0; allGestures.size() < Gesture.values().length && i < 500; i++) {
            allGestures.add(Gesture.random());
        }

        assertEquals(allGestures.size(), Gesture.values().length);

    }

    @Test
    public void testGameMechanics() {

    }
}
