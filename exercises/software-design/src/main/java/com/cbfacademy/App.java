package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        // inversion of control. Replace the new DiceGame() statement in App with GameFactory.create();  
//        DiceGame game = new DiceGame();                 
        DiceGame game = GameFactory.create();
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}

// This delegated responsibility to the factory allows us to decouple the DiceGame class from the DicePlayer class.

// OUTPUT

/* Game started. Target score: 30

Player 1 rolled a 4
Player 2 rolled a 2

Player 1 rolled a 2
Player 2 rolled a 5

Player 1 rolled a 6
Player 2 rolled a 1

Player 1 rolled a 4
Player 2 rolled a 5

Player 1 rolled a 1
Player 2 rolled a 5

Player 1 rolled a 2
Player 2 rolled a 6

Player 1 rolled a 5
Player 2 rolled a 1

Player 1 rolled a 3
Player 2 rolled a 4

Player 1 rolled a 6
Player 2 rolled a 5

It's a draw!
*/