/* Create a simple program with one class:
ExerciseClient which requests a connection to server, sends a simple text message to the server.
Ensure to release all resources at the end of your program.
*/
// // BOTH METHODS WORK
// // First, let’s create the Client class:
// package com.cbfacademy;
// import java.io.*;
// import java.net.*;

// public class Client {
//     private Socket socket = null;
//     private DataInputStream input = null;
//     private DataOutputStream out = null;

//     public Client(String address, int port) {
//         try {
//             // Establish a socket connection to the server
//             socket = new Socket(address, port);
//             System.out.println("Connected");

//             // Initialize input stream to read user input
//             input = new DataInputStream(System.in);

//             // Initialize output stream to send data to the server
//             out = new DataOutputStream(socket.getOutputStream());
//         } catch (UnknownHostException u) {
//             System.out.println(u);
//             return;
//         } catch (IOException i) {
//             System.out.println(i);
//             return;
//         }

//         String line = "";
//         while (!line.equals("Over")) {
//             try {
//                 // Read input from the user
//                 line = input.readLine();

//                 // Send the input to the server
//                 out.writeUTF(line);
//             } catch (IOException i) {
//                 System.out.println(i);
//             }
//         }

//         // Close input, output streams, and the socket
//         try {
//             input.close();
//             out.close();
//             socket.close();
//         } catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         // Create a client instance with server IP address and port
//         Client client = new Client("127.0.0.1", 5000);
//     }
// }

// Explanation:

// We import necessary classes (java.io.* and java.net.*).
// The Client class establishes a socket connection to the server using the specified IP address and port.
// It initializes input and output streams for communication.
// The client reads input from the user until “Over” is typed.
// The input is sent to the server using out.writeUTF(line).
// Finally, the client closes the resources (input, output streams, and socket).

// Next, let’s create the Server class. It will handle incoming client requests:

// BELOW METHOD WORKS

/*
package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket; // program uses the ServerSocket class
import java.net.Socket;

import java.net.*;
import java.io.*;

public class ExerciseClient {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public ExerciseClient(int port) {
        try {
            // Create a ServerSocket that listens on the specified port
            server = new ServerSocket(port);
            System.out.println("Server started");

            // Accept client connection
            socket = server.accept();

            // Initialize input stream to read data from the client
            in = new DataInputStream(socket.getInputStream());

            // Read data from the client
            String receivedData = in.readUTF();
            System.out.println("Received from client: " + receivedData);
        } catch (IOException i) {
            System.out.println(i);
        } finally {
            try {
                // Close input stream and socket
                in.close();
                socket.close();
                server.close();
            } 
            
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        // Create a server instance with the desired port
        ExerciseClient server = new ExerciseClient(5000);
    }
}
*/
    

// BREAKING DOWN THE CODE LINE BY LINE

// The above program creates the server (ExerciseClient class) which handles incoming client requests

// Explanation of the code:

// 1). The ExerciseClient class creates a ServerSocket that listens on the specified port.
// 2). It accepts incoming client connections using ExerciseClient.accept().
// 3). The server reads data sent by the client using in.readUTF().
// 4). Finally, it closes the resources (input stream and socket) when done.1
// Remember to replace the IP address ("127.0.0.1") with the actual server IP if needed. Also, ensure that the server is running before executing the client program.

// The ExerciseClient class uses two try blocks for different purposes:

// 1. First try block:
// The outer try block is used to handle exceptions related to creating the ServerSocket and accepting incoming client connections.
// If any exception occurs during these operations (e.g., port already in use), it will be caught by this block.
// The server will print an error message and continue execution.
// The finally block ensures that resources (such as the ServerSocket) are properly closed even if an exception occurs.

// 2. Second try block:
// The inner try block is used to handle exceptions related to reading data from the client.
// Specifically, it reads data sent by the client using in.readUTF().
// If an exception occurs during this read operation (e.g., client disconnects unexpectedly), it will be caught by this block.
// The server will print an error message and close the resources (input stream and socket).
// By using separate try blocks, the code can handle different types of exceptions more effectively and ensure proper cleanup of resources. It’s a good practice for robust error handling in network programming.

// // FROM GOOGLE COPILOT - IT WORKS
package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseClient {
    public static void main(String[] args) {
        try {
            // Establish a socket connection to the server
            Socket socket = new Socket("127.0.0.1", 4040);
            System.out.println("Connected to server");

            // Initialize output stream to send data to the server
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Send a simple text message to the server
            String message = "Hello, server! This is a test message. What are you doing today?";
            out.writeUTF(message);

            // Close the output stream and the socket
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// THE ABOVE CODE EXPLAINED
// 1.	import java.io.*; and import java.net.*;: These lines import necessary classes for input/output and networking operations.
// 2.	public class ExerciseClient {: This defines the ExerciseClient class.
// 3.	public static void main(String[] args) {: This is the entry point of the program. It’s the main method that gets executed when you run the program.
// 4.	try {: We start a try block to handle exceptions.
// 5.	Socket socket = new Socket("127.0.0.1", 5000);: This line creates a socket connection to the server with the IP address "127.0.0.1" (localhost) and port 5000.
// 6.	System.out.println("Connected to server");: Prints a message to the console indicating that the client is connected to the server.
// 7.	DataOutputStream out = new DataOutputStream(socket.getOutputStream());: Initializes an output stream to send data to the server via the socket.
// 8.	String message = "Hello, server! This is a test message.";: Defines a simple text message to send to the server.
// 9.	out.writeUTF(message);: Sends the message to the server using the output stream.
// 10.	out.close();: Closes the output stream.
// 11.	socket.close();: Closes the socket connection.
// 12.	} catch (IOException e) {: If any exception related to I/O or networking occurs, it will be caught here.
// 13.	System.out.println("Error: " + e.getMessage());: Prints an error message if an exception occurs.


// ANDREW'S CODE - TUTOR - WORKS

// package com.cbfacademy;

// import java.io.*;
// import java.net.*;

// public class ExerciseClient {
//     public static void main(String[] args) {
//         try (Socket socket = new Socket("localhost", 4040);
//                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

//             String message = "Hello, World!";
//             out.println(message);
//             System.out.println("Sent message to server: " + message);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
// // To run the code use ./mvnw -q clean compile exec:java -Dexec.mainClass=com.cbfacademy.ExerciseClient
