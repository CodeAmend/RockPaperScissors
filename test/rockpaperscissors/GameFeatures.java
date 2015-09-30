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

    @Test
    public void get_random_gesture() {
        Set<Gesture> gestures = new HashSet<>(Arrays.asList(Gesture.values()));
        for(int i = 0; i < 50; i++) {
            gestures.remove(Gesture.getRandomGesture());
        }
        assertTrue(gestures.isEmpty());
    }
}
