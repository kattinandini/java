package com.bridgelab.assignmentfour;
import java.util.*;
public class SnakeLadder {
    private static final int WINNING_POSITION = 100;
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {
        playGameWithSinglePlayer();
    }

    private static void playGameWithSinglePlayer() {
        int playerPosition = 0;
        int diceRolls = 0;
        Random random = new Random();

        while (playerPosition < WINNING_POSITION) {
            int roll = random.nextInt(6) + 1;
            diceRolls++;
            int option = random.nextInt(3);

            switch (option) {
                case NO_PLAY:
                    break;
                case LADDER:
                    playerPosition += roll;
                    break;
                case SNAKE:
                    playerPosition -= roll;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
            if (playerPosition > WINNING_POSITION) {
                playerPosition -= roll;
            }
            System.out.println("Player position after dice roll " + diceRolls + " : " + playerPosition);
        }
        System.out.println("Number of times the dice was played to win the game: " + diceRolls);
    }
}
