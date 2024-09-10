package com.ismet;

public class TimedMessage {

    public static void main(String[] args) {
        String message = "whatugugygnkbknhghgghhggghhghghbfgfhgbhghhghyhuyhhyygyfygfgffhgfbvgffdvbfbgfbgfggggggggggggggggggggggggggggggggggggggggggggggggggggghffgffreuyfdf7ferf98rt9+rte98rg5etrer9erfrf8wrre68e5er5erewr5r554rgetrtrgh65ytht98hgg54";

        // Loop through each character in the message
        for (int i = 0; i < message.length(); i++) {
            // Print the current character without a newline
            System.out.print(message.charAt(i));

            // Flush the output stream to ensure the character is printed immediately
            System.out.flush();

            // Wait for 1 second before printing the next character
            try {
                Thread.sleep(50); // 1000 milliseconds = 1 second
            } catch (InterruptedException e) {
                // Handle the exception
                e.printStackTrace();
            }
        }

        // Print a newline at the end of the message
        System.out.println();
    }
}
