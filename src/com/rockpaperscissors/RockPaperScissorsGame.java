package com.rockpaperscissors;
import static com.rockpaperscissors.Gesture.*;

/**
 * Created by codeamend on 9/28/15.
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {

        RockPaperScissorsGame rps = new RockPaperScissorsGame();
        for(int i = 0; i < 10; i++) {
            rps.play();
        }
    }

    private void play() {
        oneTwoThreeShoot();
    }

    private void oneTwoThreeShoot() {
        Gesture computer = Gesture.random();
        Gesture myPick = Gesture.random();
        getScore(myPick, computer);
    }

    private void getScore(Gesture myPick, Gesture computer) {
        if(myPick.equals(computer)) {
            System.out.printf("Computer:%s\nMy Pick :%s\nTie!\n\n", computer, myPick);
        } else if (myPick.beats(computer)) {
            System.out.printf("Computer:%s\nMy Pick :%s\nWin!\n\n", computer, myPick);
        } else {
            System.out.printf("Computer:%s\nMy Pick :%s\nLose!\n\n", computer, myPick);
        }
    }

}
