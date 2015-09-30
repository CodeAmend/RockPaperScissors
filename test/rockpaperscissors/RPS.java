package rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import static rockpaperscissors.Gesture.*;
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
    public void paper_beats_rock() {
        Assert.assertTrue(PAPER.beats(ROCK));
        
    }

}
