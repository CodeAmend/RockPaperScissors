package com.rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;
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

        Gesture myGesture;
        Gesture computer;

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

}
