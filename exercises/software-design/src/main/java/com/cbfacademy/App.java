package com.cbfacademy;

public class App {
    public static void main(String[] args) {

// Add a call to initialiseContainer in the main method of App, before any factory method calls.        
        SimpleContainer container = initialiseContainer();

        // inversion of control. Replace the new DiceGame() statement in App with GameFactory.create();  
//        DiceGame game = new DiceGame();  
 // Modify the game member in App to be of type Game rather than DiceGame.              
        // DiceGame game = GameFactory.create();
        // Game game = GameFactory.create();

        // Replace the call to GameFactory.create() with container.get(Game.class)     
        Game game = container.get(Game.class);
        // Modify the main method in App to create two Player instances (using PlayerFactory) and pass them to the DiceGame constructor.
        // Remove the calls to PlayerFactory.create()

        // Player player1 = PlayerFactory.create();
        // Player player2 = PlayerFactory.create();

        // Create a DiceGame instance and pass them Player instances to the DiceGame constructor.
//        Game game = new DiceGame(player1, player2); 

        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

//MODIFICATIONS 6 8 2024 AFTER IoC Container
// Add the following method to the App class:
    private static SimpleContainer initialiseContainer() {
 // Modify the initialiseContainer method to register mappings for the Game and Player interfaces with their concrete implementations in the container, e.g. container.register(Game.class, DiceGame.class) 
        SimpleContainer container = new SimpleContainer();      
        // Register mappings for any required interfaces with their concrete implementations
        container.register(Game.class, DiceGame.class);
        container.register(Player.class, DicePlayer.class);

        return container;
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

// CODE BEFORE IOC CONTAINERS
// public class App {
//     public static void main(String[] args) {

//         // inversion of control. Replace the new DiceGame() statement in App with GameFactory.create();  
// //        DiceGame game = new DiceGame();  
//  // Modify the game member in App to be of type Game rather than DiceGame.              
//         // DiceGame game = GameFactory.create();
//         // Game game = GameFactory.create();
// // Modify the main method in App to create two Player instances (using PlayerFactory) and pass them to the DiceGame constructor.
//         Player player1 = PlayerFactory.create();
//         Player player2 = PlayerFactory.create();

//         // Create a DiceGame instance and pass them Player instances to the DiceGame constructor.
//         Game game = new DiceGame(player1, player2);        
//         String winner = game.play();



//         if (winner == null) {
//             System.out.println("It's a draw!");
//         } else {
//             System.out.println(winner + " wins!");
//         }
//     }
    
// }