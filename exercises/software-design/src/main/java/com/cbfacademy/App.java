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

// meaning of the initialiseContainer method:

// SimpleContainer initialiseContainer(): This is the method signature. It defines a method named initialiseContainer that returns an instance of SimpleContainer (SimpleContainer is another class defined within this package)
// SimpleContainer container = new SimpleContainer(); This line creates a new instance of SimpleContainer and assigns it to the variable container.
// container.register(Game.class, DiceGame.class). This line tells the container to map the Game interface to the DiceGame class. So, whenever the container is asked to provide an instance of Game, it will create and return an instance of DiceGame. This is because Game is an interface and interfaces cannot be instantiated directly. DiceGame implements the Game interface and provides the actual implementation of the methods defined in the Game interface. That's why you can create an instance of DiceGame as it has concrete implementations.
// Why the Container Creates an Instance of DiceGame When you register Game.class with DiceGame.class in the container: i.e. container.register(Game.class, DiceGame.class); You are telling the container that whenever it needs to provide an instance of Game, it should create and return an instance of DiceGame. This is because DiceGame is a concrete class that implements the Game interface, providing the necessary method implementations.
// The container maps the interface to a concrete class so it can provide instances of the class when needed.

// container.register(Player.class, DicePlayer.class); This line tells the container to map the Player interface to the DicePlayer class. So, whenever the container is asked to provide an instance of Player, it will create and return an instance of DicePlayer.

// This delegated responsibility to the factory allows us to decouple the DiceGame class from the DicePlayer class.
// return container; This line returns the container object that has been initialized and configured.
// In Java, Game.class refers to the Class object associated with the Game class. It is a way to refer to the class itself rather than an instance of the class. This is often used in reflection and in frameworks that need to work with class types dynamically
// what do you mean by the class object associated with the Game class?
// In Java, every class or interface has an associated Class object that contains metadata about the class or interface. This Class object is created by the Java Virtual Machine (JVM) when the class is loaded.

// When you use Game.class, you are referring to this Class object for the Game interface. This Class object provides information about the Game interface, such as its methods, fields, and constructors. It is often used in reflection, which allows you to inspect and manipulate classes and objects at runtime.

// Here’s a simple analogy: think of Game.class as a blueprint or a description of the Game interface. It doesn’t represent an instance of Game (since Game is an interface and cannot be instantiated directly), but rather it represents the type itself.


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

// CODE BEFORE THE CONTAINERS
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