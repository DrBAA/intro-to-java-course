package com.cbfacademy;

// Modify the DiceGame class to implement the Game interface and the DicePlayer class to implement the Player interface.

public class DicePlayer implements Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int roll() {
        int score = (int) (Math.random() * 6) + 1;
        
        System.out.println(name + " rolled a " + score);

        return score;
    }
}
