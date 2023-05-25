package com.mon.socket.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@SpringBootApplication
public class ClientApplication
{

    public static void main(String[] args) throws
                                           IOException
    {
        String serverAddress = "localhost";
        int    serverPort    = 8888;

        Socket socket = new Socket(
                serverAddress,
                serverPort
        );
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(),
                true
        );
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Send requests to the server
        String request1 = "Hello";
        String request2 = "How are you?";

        out.println(request1);
        out.println(request2);

        // Read responses from the server
        String response1 = in.readLine();
        String response2 = in.readLine();

        System.out.println("Response 1: " + response1);
        System.out.println("Response 2: " + response2);

        // Close the resources
        out.close();
        in.close();
        socket.close();
    }

}