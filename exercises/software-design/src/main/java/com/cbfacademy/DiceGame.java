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
    public DiceGame(Player player1, Player player2) {
         this.player1 = player1;
         this.player2 = player2;
        // inversion of control. Replace the new DicePlayer() statements in DiceGame with PlayerFactory.create()
//        player1 = new DicePlayer(); 

// below code might not be needed as the objects will be created by GameFactory which will pass them to DiceGame's constructor
        // this.player1 = PlayerFactory.create();
        // this.player2 = PlayerFactory.create();
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

// In the above code, I modified the DiceGame constuctor to accept two Player instances as shown on line 20 above. However, after modifying the code, I was getting an error on the return statement of the GameFactory class saying the constructor DiceGame() is undefined.
// To resolve this problem without changing the GameFactory class,  Copilot suggested for me to add a default constructor,  to the DiceGame class that initializes the Player instances internally. Therefore I have added the default constructor as shown on line 14 above. i.e. 
/*public DiceGame() {
    this(PlayerFactory.create(), PlayerFactory.create());
} */
// the error on the GameFactory class is now resolved.

// why do we need 2 constructors on the same class?
// Copilot explained that:
// Having two constructors in the same class, known as constructor overloading, provides flexibility in how objects of that class can be created. In this case:

// Default Constructor: This allows the GameFactory class to create a DiceGame instance without needing to pass Player instances. It internally creates the Player instances using PlayerFactory.
// Parameterized Constructor: This allows for more control when creating a DiceGame instance, enabling you to pass specific Player instances. This is useful when you want to customize the players or use existing player objects.
// By providing both constructors, you can accommodate different use cases without changing the existing code structure.