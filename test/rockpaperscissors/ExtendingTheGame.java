package rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;
import static rockpaperscissors.Gesture.*;
/**
 * Created by codeamend on 10/1/15.
 */
public class ExtendingTheGame extends Assert {

    @Test
    public void spock_beats_scissors() {
        assertTrue(SPOCK.beats(SCISSORS));
    }

    @Test
    public void lizard_beats_paper() {
        assertTrue(LIZARD.beats(PAPER));
    }


}
