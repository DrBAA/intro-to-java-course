// this program connects to the CBF academy website homepage, then prints its content to the screen line by line. The program uses try-with-resources construct and  release all resources at the end of the program.

package com.cbfacademy;

import java.net.URI;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URI("https://codingblackfemales.com/").toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }

                // Closing the connection
                connection.disconnect();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// to run the code
// ./mvnw -q clean compile exec:java -Dexec.mainClass=com.cbfacademy.App

