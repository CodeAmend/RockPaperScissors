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

    // Winning
    @Test
    public void winningGesture() {
        Assert.assertTrue("Winning", Gesture.PAPER.beats(Gesture.ROCK));
        Assert.assertTrue("Winning", Gesture.ROCK.beats(Gesture.SCISSORS));
        Assert.assertTrue("Winning", Gesture.SCISSORS.beats(Gesture.PAPER));
    }

    //Losing
    @Test
    public void losingGesture() {
        Assert.assertFalse("Losing", Gesture.ROCK.beats(Gesture.PAPER));
        Assert.assertFalse("Losing", Gesture.PAPER.beats(Gesture.SCISSORS));
        Assert.assertFalse("Losing", Gesture.SCISSORS.beats(Gesture.ROCK));
    }

    @Test
    public void tieGesture() {
        
    }
}
