package com.rockpaperscissors;

import com.rockpaperscissors.Gesture;
import org.junit.Assert;
import org.junit.Test;
import static com.rockpaperscissors.Gesture.ROCK;
import static com.rockpaperscissors.Gesture.PAPER;
import static com.rockpaperscissors.Gesture.SCISSORS;

/**
 * Created by codeamend on 9/28/15.
 */
public class RPS {

    // I have three valid moves: Rock, Paper, or Scissors.
    // The result will be either
    // a tie when the computer and I make the same move,
    // or I will win, or the computer will win.
    // Scissors cut Paper, Paper covers Rock, Rock smashes Scissors.

    // Winning
    @Test
    public void winningGesture() {
        Assert.assertTrue("Winning", PAPER.beats(ROCK));
        Assert.assertTrue("Winning", ROCK.beats(SCISSORS));
        Assert.assertTrue("Winning", SCISSORS.beats(PAPER));
    }

    //Losing
    @Test
    public void losingGesture() {
        Assert.assertFalse("Losing", ROCK.beats(PAPER));
        Assert.assertFalse("Losing", PAPER.beats(SCISSORS));
        Assert.assertFalse("Losing", SCISSORS.beats(ROCK));
    }

    @Test
    public void tieGesture() {
        //TODO: what do I want to happen here?
        //Only two possibilities currently
        //Perhaps a new enum Staus { WIN, LOSE, TIE }
    }
}
