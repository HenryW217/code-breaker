package com.tlgjavaproject;


import java.util.*;

public class CodeBreaker {
    /*Terms:
    The system generated 4 digit #, ref as "answer";
    If we are able to use Map, use w,x,y,z as value of Map;
    Use "i" for guesses count, the reason we count down is for future usage if we print "lives left";
    playerEntry is the guesses the player entered;

     */


    //TODO Generate the answer, four digit non-duplicated, *use Map?; (Henry)
    private final List<Answer> answer;
        ArrayList<Integer> list = new ArrayList<Integer>();
    for (int r = 0; r < 10; r++){
        list.add(r);
    } // To generate an Array list from 0 to 9;
        Collections.shuffle(list); // Shuffle the list;
    int a = list.get(0);
    int b = list.get(1);
    int c = list.get(2);
    int d = list.get(3);

    Map<> answerMap = new HashMap<>(); // put the four-digit numbers into their location.
    answerMap.put(a,w);
    answerMap.put(b,x);
    answerMap.put(c,y);
    answerMap.put(d,z);

    //TODO Print out instruction for the player, and give them the
    // block enter their first guess; (Henry)

    System.out.println("CODE BREAKER");
    System.out.println("(Try to break the code.)");
    System.out.println("\nINSTRUCTIONS");
    System.out.println("- A numerical code made up of four digits will be created.");
    System.out.println("- Each digit will be either 0, 1, 2, 3, 4, 5, 6, 7, 8, or 9. No digits will be repeated");
    System.out.println("- Attempt to break the code by entering a four-digit number that contains four different digits matching those listed above.");

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
