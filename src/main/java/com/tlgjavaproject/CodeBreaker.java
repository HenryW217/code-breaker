package com.tlgjavaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    //test purposes
    private static int count = 0;


    public static void main(String[] args) {

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
        //System.out.println("***Test purpose only, the answer is: " + answer + " ***"); // TODO !!!This line is to test only, remove after code complete!!!


// Create the loop
        while (count < 7){
            System.out.println("\n Guess a 4 digit number");
            playerGuess.playerEntry();
            playerGuess.compareInput();
            input.clear();
        }


    }
    // Create method to get input Array list.
    private void playerEntry() {
        Scanner sc = new Scanner(System.in);
        int entry = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            input.add(0, entry % 10);
            entry = entry / 10;
        }
            //System.out.println("***Test purpose, player entry is: " + input + " ***");// TODO !!!This line is to test only, remove after code complete!!!
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
        count++;
        codebreakNum();
        //System.out.printf("%dA%dB", aCount, bCount);
        //System.out.println();

        aCount = 0;
        bCount = 0;
    }

    //Test purposes
    public static void codebreakNum() {
        if (count == 1) {
            System.out.println("\n Try again! Six tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 2) {
            System.out.println("Try again! Five tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 3) {
            System.out.println("Try again! Four tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 4) {
            System.out.println("Try again! Three tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 5) {
            System.out.println("Try again! Two tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 6) {
            System.out.println("Try again! One tries left");
            System.out.printf("%dA%dB", aCount, bCount);
        }
        if (count == 7) {
            System.out.println("You did not crack the code!");
            System.out.println("GAME OVER! The code is " + answer);
        }
    }

}
