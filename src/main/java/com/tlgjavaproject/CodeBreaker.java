package com.tlgjavaproject;

import java.util.*;
import java.util.stream.Collectors;

public class CodeBreaker {
    /*Terms:
    The system generated 4 digit #, ref as "answer";
    Use "i" for guesses count, the reason we count down is for future usage if we print "lives left";
    playerEntry is the guesses the player entered;

     */
    private static int guessLeft = 7;
    private static ArrayList answer = new ArrayList();
    private static ArrayList input = new ArrayList();

    private static int aCount = 0;
    private static int bCount = 0;




    public static void main(String[] args) {

        int numGuess = 1;    //Number of attempts made.
        int attemptsRemaining = guessLeft;  //Number of attempts remaining.
        boolean codesBroken = false;  //Flag indicating an attempted code matches the game code.
        int[] attemptScore = new int[3];  //The score of the latest attempt.



        CodeBreaker playerGuess = new CodeBreaker();

        System.out.println("CODE BREAKER");
        System.out.println("(Try to break the code.)");
        System.out.println("\nINSTRUCTIONS");
        System.out.println("- A numerical code made up of four digits will be created.");
        System.out.println("- Each digit will be either 0, 1, 2, 3, 4, 5, 6, 7, 8, or 9. No digits will be repeated");
        System.out.println("- Attempt to break the code by entering a four-digit number that contains four different digits matching those listed above.");
        System.out.println("\nPlease enter a four-digit number below then click 'Enter', no duplicated numbers.");
        System.out.println("You have 7 opportunities to win the game. Let's play!");

        ArrayList list = new ArrayList();    // To generate an Array list from 0 to 9;

        for (int l = 0; l < 10; l++)    // "l" for the 0 - 9 list;
            list.add(l);

        Collections.shuffle(list); // Shuffle the list;
        for (int a = 0; a < 4; a++) {
            answer.add(list.get(a));

        }
        System.out.println("***Test purpose only, the answer is: " + answer + " ***"); // TODO !!!This line is to test only, remove after code complete!!!

// Create the loop
        while (true){
            playerGuess.playerEntry();
            playerGuess.compareInput();
            input.clear();


        }


//
//
//        //TODO Give player the block enter their first guess; (Paul)
//
//        Scanner console = new Scanner(System.in);
//        while (console.hasNextLine() && guessLeft < 7) {
//            System.out.println("Guess any number in the code");
//            String guess = console.nextLine();
//            while ((numGuess <= guessLeft) && (!codesBroken)) {
//                System.out.println("\nATTEMPT #" + numGuess);
//                System.out.print("Enter a 4-digit code: ");
//
//        //TODO i = 7, use i-- the guess, go back to loop; (Paul)
//        //TODO check the guess, *use if/else, getValue from Map list? and loop back for
//        // next guess; (Paul)
//                //Generated some if/else statements. Need to figure out how to  link to Array List.
//                if (attemptScore[0] != 1) {
//                    System.out.print("SCORE: " + attemptScore[0] + " exact matches");
//                }
//                if (attemptScore[1] != 1) {
//                    System.out.print(", " + attemptScore[1] + " near match");
//                }
//                if (attemptScore[2] != 1) {
//                    System.out.print(", " + attemptScore[2] + " miss");
//                }
//                if (attemptScore[0] < 4) {
//                    attemptsRemaining--;
//                    if (attemptsRemaining > 1) {
//                        System.out.println("\n" + attemptsRemaining + " attempts left!");
//                    } else if (attemptsRemaining == 1) {
//                        System.out.println("\n" + attemptsRemaining + " attempt left! Your next attempt MUST be correct.");
//                    } else {
//                        System.out.println("\n" + attemptsRemaining + " attempts left! You have run out of attempts.");
//        //TODO When i == 0 , print lose statement and answer.(Paul)
//                        System.out.println("You did not break the code.");
//                        //Thank player for playing.
//                        System.out.println("\nTHANKS FOR PLAYING.");
//                    }
//                    numGuess++;
//                }
//        //TODO When guess is correct, print win statement.(Paul)
//                //If the player breaks the code, congratulate the player.
//                else {
//                    codesBroken = true;
//                    System.out.println("\n\nWELL DONE!");
//                    System.out.println("YOU BROKE THE CODE!");
//                    //Thank player for playing.
//                    System.out.println("\nTHANKS FOR PLAYING.");
//                }
//            }
//        }


    }
    // Create method to get input Array list.
    private void playerEntry() {
        Scanner sc = new Scanner(System.in);
        int entry = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            input.add(0, entry % 10);
            entry = entry / 10;
        }
            System.out.println("***Test purpose, player entry is: " + input + " ***");// TODO !!!This line is to test only, remove after code complete!!!

    }


// Create compare result method.
    private void compareInput(){
        for(int i = 0; i < 4; i++)
            if (answer.get(i) == input.get(i))
                aCount++;
        for(Object i: answer)
            for (Object j: input)
                if (i == j)
                    bCount++;
        bCount = bCount - aCount;
        System.out.printf("%dA%dB", aCount, bCount);
        System.out.println();

        aCount = 0;
        bCount = 0;
    }


}
