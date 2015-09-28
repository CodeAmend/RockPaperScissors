package com.rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;
import static com.rockpaperscissors.Status.*;
import static com.rockpaperscissors.Gesture.*;

/**
 * Created by codeamend on 9/28/15.
 */
public class RPS extends Assert  {

    // I have three valid moves: Rock, Paper, or Scissors.
    // The result will be either
    // a tie when the computer and I make the same move,
    // or I will win, or the computer will win.
    // Scissors cut Paper, Paper covers Rock, Rock smashes Scissors.


    @Test
    public void winningGesture() {
        assertTrue(PAPER.attacks(ROCK));
        assertTrue(ROCK.attacks(SCISSORS));
        assertTrue(SCISSORS.attacks(PAPER));
    }


    @Test
    public void losingGesture() {
        assertFalse(ROCK.attacks(PAPER));
        assertFalse(PAPER.attacks(SCISSORS));
        assertFalse(SCISSORS.attacks(ROCK));
    }


    @Test
    public void tieGesture() {

        assertEquals(TIE, ROCK.attacks(SCISSORS));

    }

}
