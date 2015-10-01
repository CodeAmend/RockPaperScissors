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
    public void paper_beats_spock() {
        assertTrue(PAPER.beats(SPOCK));
    }
    @Test
    public void rock_beats_scissors() {
        assertTrue(ROCK.beats(SCISSORS));
    }
    @Test
    public void rock_beats_lizard() {
        assertTrue(ROCK.beats(LIZARD));
    }
    @Test
    public void scissors_beats_paper() {
        assertTrue(SCISSORS.beats(PAPER));
    }
    @Test
     public void scissors_beats_lizard() {
        assertTrue(SCISSORS.beats(LIZARD));
    }
    @Test
    public void spock_beats_scissors() {
        assertTrue(SPOCK.beats(SCISSORS));
    }
    @Test
    public void spock_beats_rock() {
        assertTrue(SPOCK.beats(ROCK));
    }
    @Test
    public void lizard_beats_paper() {
        assertTrue(LIZARD.beats(PAPER));
    }
    @Test
    public void lizard_beats_spock() {
        assertTrue(LIZARD.beats(SPOCK));
    }

    //losses
    @Test
    public void rock_loses_to_paper() {
        assertFalse(ROCK.beats(PAPER));
    }
    @Test
    public void rock_loses_to_spock() {
        assertFalse(ROCK.beats(SPOCK));
    }
    @Test
    public void paper_loses_to_scissors() {
        assertFalse(PAPER.beats(SCISSORS));
    }
    @Test
    public void paper_loses_to_lizard() {
        assertFalse(PAPER.beats(LIZARD));
    }
    @Test
    public void scissors_loses_to_rock() {
        assertFalse(SCISSORS.beats(ROCK));
    }
    @Test
    public void scissors_loses_to_spock() {
        assertFalse(SCISSORS.beats(SPOCK));
    }
    @Test
    public void spock_loses_to_lizard() {
        assertFalse(SPOCK.beats(LIZARD));
    }
    @Test
    public void spock_loses_to_paper() {
        assertFalse(SPOCK.beats(PAPER));
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
    public void spock_ties_with_spock() {
        assertTrue(SCISSORS.equals(SCISSORS));
    }

    @Test
    public void gesture_test() {

    }


}
