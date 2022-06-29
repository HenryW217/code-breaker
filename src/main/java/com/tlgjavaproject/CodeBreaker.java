package com.tlgjavaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeBreaker {

    private static int attemptsLeft = 7;
    private static ArrayList answer = new ArrayList();
    private static ArrayList input = new ArrayList();
    private static int aCount = 0;
    private static int bCount = 0;


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
        System.out.println("***Test purpose only, the answer is: " + answer + " ***"); // TODO !!!This line is to test only, remove after code complete!!!

// Create the loop


            do {
                playerGuess.playerEntry();
                if (answer.equals(input)){
                    System.out.println("WELL DONE!");
                    System.out.println("YOU BROKE THE CODE!");
                    break;
                }
                playerGuess.compareInput();
                if (attemptsLeft >1){
                    System.out.println("Please try again, you have " + (attemptsLeft - 1) + " attempts left");
                }
                input.clear();
                attemptsLeft--;

            } while (attemptsLeft > 0);

            if (attemptsLeft == 0){
                System.out.println("THANKS FOR PLAYING. The answer is " + answer +".");
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
//            System.out.println("***Test purpose, player entry is: " + input + " ***");// TODO !!!This line is to test only, remove after code complete!!!

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
