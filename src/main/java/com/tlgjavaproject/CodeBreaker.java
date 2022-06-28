package com.tlgjavaproject;


import java.util.*;


public class CodeBreaker {
    /*Terms:
    The system generated 4 digit #, ref as "answer";
    If we are able to use Map, use w,x,y,z as value of Map;
    Use "i" for guesses count, the reason we count down is for future usage if we print "lives left";
    playerEntry is the guesses the player entered;

     */
    private static int guessLeft = 7;
    private static ArrayList answer = new ArrayList();
    private static ArrayList guessNum = new ArrayList();


    public static void main(String[] args) {


        CodeBreaker playerGuess = new CodeBreaker();
        // I took the ones you entered, should we add \n for last three lines?
        System.out.println("CODE BREAKER");
        System.out.println("(Try to break the code.)");
        System.out.println("\nINSTRUCTIONS");
        System.out.println("- A numerical code made up of four digits will be created.");
        System.out.println("- Each digit will be either 0, 1, 2, 3, 4, 5, 6, 7, 8, or 9. No digits will be repeated");
        System.out.println("- Attempt to break the code by entering a four-digit number that contains four different digits matching those listed above.");
        System.out.println("\nPlease enter a four-digit number below then click 'Enter', no duplicated numbers.");
        System.out.println("You have 7 opportunities to win the game. Let's play!");

        //TODO Generate the answer, four digit non-duplicated, *use Map?; (Henry)
        ArrayList list = new ArrayList();    // To generate an Array list from 0 to 9;

        for (int l = 0; l < 10; l++)    // "l" for the 0 - 9 list;
            list.add(l);

        Collections.shuffle(list); // Shuffle the list;
        for (int a = 0; a < 4; a++){
            answer.add(list.get(a));
            System.out.println(answer); // TODO !!!This line is to test only, remove after code complete!!!
        }
    }
    //TODO Print out instruction for the player, and give them the
    // block enter their first guess; (Paul)


    //TODO link the guess to program;

    //TODO i = 7, use i-- the guess, go back to loop; (Paul)

    //TODO check the guess, *use if/else, getValue from Map list? and loop back for
    // next guess; (Paul)

    //TODO When i == 0 , print lose statement and answer.
    //TODO When guess is correct, print win statement.

    //TODO Optionals:
    //TODO Use pop up windows for all;
    //TODO Print out guesses left and full history with %dA%dB


}
