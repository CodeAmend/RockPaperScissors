package rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import static rockpaperscissors.Gesture.*;
/**
 * Created by codeamend on 9/28/15.
 */
public class AllCombinations extends Assert {

    //Wins
    @Test
    public void paper_beats_rock() {
        assertTrue(PAPER.beats(ROCK));
    }
    @Test
    public void rock_beats_scissors() {
        assertTrue(ROCK.beats(SCISSORS));
    }
    @Test
    public void scissors_beats_paper() {
        assertTrue(SCISSORS.beats(PAPER));
    }

    //losses
    @Test
    public void rock_loses_to_paper() {
        assertFalse(ROCK.beats(PAPER));
    }
    @Test
    public void paper_loses_to_scissors() {
        assertFalse(PAPER.beats(SCISSORS));
    }
    @Test
    public void scissors_loses_to_rock() {
        assertFalse(SCISSORS.beats(ROCK));
    }

    //Tie
    @Test
    public void rock_ties_with_rock() {
        assertTrue(ROCK.equals(ROCK));
    }
    @Test
    public void paper_ties_with_paper() {
        assertTrue(PAPER.equals(PAPER));
    }
    @Test
    public void scissors_ties_with_scissors() {
        assertTrue(SCISSORS.equals(SCISSORS));
    }

    @Test
    public void gesture_test() {

    }

}