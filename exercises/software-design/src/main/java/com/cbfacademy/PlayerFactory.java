package com.cbfacademy;


public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */

// Modify the GameFactory and PlayerFactory classes to return instances of the Game and Player interfaces rather than the concrete classes.    
    // public static DicePlayer create() {
    //     return new DicePlayer();

    public static Player create() {
        return new DicePlayer();

    }
}
