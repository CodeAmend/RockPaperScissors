package rockpaperscissors;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by codeamend on 9/30/15.
 */
public class GameFeatures extends Assert {

    Set<Gesture> gestures = new HashSet<>(Arrays.asList(Gesture.values()));

    @Test
    public void get_random_gesture() {
        for(int i = 0; i < 50; i++) {
            gestures.remove(Gesture.randomHand());
        }
        assertTrue(gestures.isEmpty());
    }
}
