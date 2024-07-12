/* Create a simple program with one class:
ExerciseServer class which uses a ServerSocket to listen for connections on localhost:4040, then prints message it receives on the screen.
Ensure to release all resources at the end of your program.
*/

/*This program creates a server (ExerciseServer class) that uses a ServerSocket to listen for connections on localhost:4040. When a client connects, it reads messages from the client and prints them to the console. 
The program uses try with resources and handles exceptions. 
All resources are closed at the end of the program.
*/
 

// FROM GOOGLE COPILOT - IT WORKS
package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket; // program uses the ServerSocket class
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        try {
            // Create an object of ServerSocket listening on port 4040
            ServerSocket serverSocket = new ServerSocket(4040);
            System.out.println("The server is listening on port 4040...");

            // Using the serversocket object to accept incoming connections by calling the accept () method of the ServerSocket class
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Read messages from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Received message: " + message);
            }

            // Close resources
            reader.close(); // 
            clientSocket.close(); // terminate the connection with the client:
            serverSocket.close(); // Terminate the server:
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}




// // ANDREW'S (TUTOR) CODE AND IT WORKS
// package com.cbfacademy;

// import java.io.*;
// import java.net.*;

// public class ExerciseServer {
//     public static void main(String[] args) {
//         try (ServerSocket serverSocket = new ServerSocket(4040)) {
//             System.out.println("Server is listening on port 4040...");

//             while (true) {
//                 try (Socket clientSocket = serverSocket.accept();
//                      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
//                     String message = in.readLine();

//                     System.out.println("Received message from client: " + message);
//                 }
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
// // To run the server, use ./mvnw -q clean compile exec:java -Dexec.mainClass=com.cbfacademy.ExerciseServer
// // while (true) in thea bove code means the server will continue running until it is stopped.
// // To stop the server, type Ctrl+C on the command prompt
