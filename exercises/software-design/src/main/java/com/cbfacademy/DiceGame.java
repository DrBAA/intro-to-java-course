package com.cbfacademy;

// Modify the DiceGame class to implement the Game interface and the DicePlayer class to implement the Player interface.

public class DiceGame implements Game {
    // Modify the player1 and player2 members in DiceGame to be of type Player rather than DicePlayer.    
    // private DicePlayer player1;
    // private DicePlayer player2;    
    private Player player1;
    private Player player2;
    private int targetScore = 30;

    // default constructor to initialize the Player instances internally.
    // public DiceGame() {
    //     this(PlayerFactory.create(), PlayerFactory.create());
    // }
// We have now inverted control and introduced abstraction, but our classes are still tightly coupled to the factory classes. Let's resolve this by instead injecting dependencies into the constructor of the DiceGame class.
    // Modify the DiceGame constructor to accept two Player instances.
    // public DiceGame() { 
    // The DiceGame constructor now directly accepts Player objects, ensuring dependency injection. 
    // by injecting the Player instances into the DiceGame constructor, we have now successfully decoupled DiceGame from DicePlayer. 
    public DiceGame(Player player1, Player player2) {
        // Player player1 = PlayerFactory.create();
        // Player player2 = PlayerFactory.create();        
         this.player1 = player1;
         this.player2 = player2;
        // inversion of control. Replace the new DicePlayer() statements in DiceGame with PlayerFactory.create()
//        player1 = new DicePlayer(); 
        this.player1.setName("Player 1");
        this.player2.setName("Player 2");
    }

    public String play() {
        int score1 = 0;
        int score2 = 0;
        String winner = null;

        System.out.println("Game started. Target score: " + targetScore);
        System.out.println();

        while (score1 < targetScore && score2 < targetScore) {
            score1 += player1.roll();
            score2 += player2.roll();
            System.out.println();
        }

        if(score1 > score2) {
            winner = player1.getName();
        } else if (score2 > score1) {
            player2.getName();
        }
        
        return winner;
    }
}

// The above delegated responsibility to the factory allows us to decouple the DiceGame class from the DicePlayer class.

