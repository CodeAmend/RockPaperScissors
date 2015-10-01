package rockpaperscissors;
import static rockpaperscissors.Gesture.*;
/**
 * Created by codeamend on 10/1/15.
 */
public class RockPaperScissors {

    private Gesture usersHand;
    private Gesture computersHand;

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        rps.oneTwoThreeShoot();
    }

    public void oneTwoThreeShoot() {
        usersHand = ROCK;
        computersHand = Gesture.getRandomGesture();
        displayScore(usersHand, computersHand);
    }

    private void displayScore(Gesture user, Gesture opponent) {
        if(user.beats(opponent)) {
            System.out.printf("User: %s\n" + "Comp: %s\n" + "You Win!!!\n\n", user, opponent);
        } else if(user.equals(opponent)) {
            System.out.printf("User: %s\n" + "Comp: %s\n" + "It's a Tie!!!\n\n", user, opponent);
        } else {
            System.out.printf("User: %s\n" + "Comp: %s\n" + "You Lose!!!\n\n", user, opponent);
        }
    }

}
