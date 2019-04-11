package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("(please reply in lower case)");
        while (true) {
            String reply = reader.nextLine();
            if (reply.contains("fuck") || reply.contains("shit") || reply.contains("ass ")
                    || reply.contains("asshole")){
                System.out.println("Why I never! Foul language is not tolerated by a program such as I. Good day sir.");
                break;
            }
            if (reply.contains("bye") || reply.contains("farewell") || reply.contains("later")) {
                System.out.println("Please enjoy your day =)");
                break;
            }
            if (reply.contains("hello") || reply.contains("greetings") || reply.contains("hi")) {
                System.out.println("You are so polite! How is your day?");
            }
            if (reply.contains("good")) {
                System.out.println("\"Well\" is the preferred word, please improve your grammar.");
            }
            if (reply.contains("well") && !reply.contains("good")) {
                System.out.println("Such fine grammar =)");
            }
            if (reply.contains("thanks")){
                System.out.println("You're welcome!");
            }
            if (reply.contains("no problem")){
                System.out.println("Surely, and yet so few utilize good manners.");
            }
            if (reply.contains("rude")){

            }
        }
    }
}