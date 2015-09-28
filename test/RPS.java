import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by codeamend on 9/28/15.
 */
public class RPS {

    // I have three valid moves: Rock, Paper, or Scissors.
    // The result will be either
    // a tie when the computer and I make the same move,
    // or I will win, or the computer will win.
    // Scissors cut Paper, Paper covers Rock, Rock smashes Scissors.

    @Test
    public void paperBeatsRock() {
        Assert.assertTrue(Gesture.PAPER.beats(Gesture.ROCK));
    }

    @Test
    public void rockBeatsPaper() {
        Assert.assertFalse(Gesture.ROCK.beats(Gesture.PAPER));
    }

    @Test
     public void paperBeatsScissors() {
        Assert.assertFalse(Gesture.PAPER.beats(Gesture.SCISSORS));
    }
}
