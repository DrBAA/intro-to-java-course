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

    public static Game create() {
        return new DiceGame();
    }
}
