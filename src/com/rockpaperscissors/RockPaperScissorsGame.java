package com.rockpaperscissors;
import static com.rockpaperscissors.Gesture.*;

/**
 * Created by codeamend on 9/28/15.
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {

        RockPaperScissorsGame rps = new RockPaperScissorsGame();
        for(int i = 0; i < 500; i++) {
            rps.play();
        }
    }

    private void play() {
        oneTwoThreeShoot();
    }

    private void oneTwoThreeShoot() {
        Gesture computer = Gesture.random();
        Gesture myPick = ROCK;
        getScore(myPick, computer);
    }

    private void getScore(Gesture myPick, Gesture computer) {
        if(myPick.equals(computer)) {
            System.out.println("It's a tie!!!");
        } else if (myPick.beats(computer)) {
            System.out.println("You win!!!");
        } else {
            System.out.println("You Lose!!!");
        }
    }

}
