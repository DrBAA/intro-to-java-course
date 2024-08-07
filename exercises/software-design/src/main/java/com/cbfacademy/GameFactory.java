package com.cbfacademy;

// 
public class GameFactory {
    /**
     * Creates a new dice game.
     *
     * @return A dice game.
     */
// Modify the GameFactory and PlayerFactory classes to return instances of the Game and Player interfaces rather than the concrete classes.
    // public static DiceGame create() {
    //     return new DiceGame();
    //  change the GameFactory.create() method to pass the Player objects to the modified DiceGame constructor
    // public static Game create() {
    //     return new DiceGame();
    // }

// The GameFactory.create() method creates Player instances using PlayerFactory.create() and passes them to the DiceGame constructor
    public static Game create() {
        Player player1 = PlayerFactory.create();
        Player player2 = PlayerFactory.create();
        // This line injects the Player objects into the DiceGame constructor
        return new DiceGame(player1, player2);
    }

}
