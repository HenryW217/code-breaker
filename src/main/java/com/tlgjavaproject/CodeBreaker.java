package com.tlgjavaproject;

import java.util.*;

public class CodeBreaker {

    public static int attemptsLeft = 7;
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static ArrayList<Integer> input = new ArrayList<>();
    private static int aCount = 0;
    private static int bCount = 0;

// Print out welcome message to give the player instructions.
    void welcomeMessage() {
        System.out.println("CODE BREAKER");
        System.out.println("(Try to break the code.)");
        System.out.println("\nINSTRUCTIONS");
        System.out.println("- A numerical code made up of four digits will be created.");
        System.out.println("- Each digit will be either 0, 1, 2, 3, 4, 5, 6, 7, 8, or 9. No digits will be repeated");
        System.out.println("- Attempt to break the code by entering a four-digit number that contains four different digits matching those listed above.");
        System.out.println("\nPlease enter a four-digit number below then click 'Enter', no duplicated numbers.");
        System.out.println("You have 7 opportunities to win the game. Let's play!");
    }

    // Generate a random four-digit number in the memory as the answer for player to guess
    // by creating a 0-9 list, shuffle them, then take the first four digits.
    void answerGenerator() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int l = 0; l < 10; l++)
            list.add(l);

        Collections.shuffle(list);

        for (int a = 0; a < 4; a++) {
            answer.add(list.get(a));
        }
    }

    // Convert player's input into an Array list.
    // at mean time, check to make sure
    //                  - player entered numbers;
    //                  - player's input is a four-digit number;
    void playerEntry() {
        Scanner sc = new Scanner(System.in);
        int entry;

        while (!sc.hasNextInt()) {
            System.out.println("Invalidated input, please enter a four-digit NUMBER.");
            sc.next();
        }
        entry = sc.nextInt();
        int entryLength = String.valueOf(entry).length();

        while (entryLength != 4) {
            System.out.println("Invalidated input, please enter a FOUR-digit number.");
            // I have a feeling that these following two line could be re-initialized
            // in another way, I tried, but break the code. So I'll leave it as is for now.
            entry = sc.nextInt();
            entryLength = String.valueOf(entry).length();
        }

        for (int i = 0; i < 4; i++) {
            input.add(0, entry % 10);
            entry = entry / 10;
        }
    }

    // This is the method to check if there are any duplicates.
    // Could be built into playerEntry, will try if we got time left.
    static boolean inputValidator() {
        for (int j = 0; j < CodeBreaker.input.size(); j++)
            for (int k = j + 1; k < CodeBreaker.input.size(); k++)

                if (k != j && Objects.equals(CodeBreaker.input.get(k), CodeBreaker.input.get(j))) {
                    return true;
                }
        return false;
    }

    // This is to compare player's input to the answer;
    // Check how many number are there with right location;
    // Then check how many number are correct;
    // Print out feedback to player.
    void compareInput() {
        for (int i = 0; i < 4; i++)
            if (Objects.equals(answer.get(i), input.get(i)))
                aCount++;
        for (Object i : answer)
            for (Object j : input)
                if (i == j)
                    bCount++;
        bCount = bCount - aCount;
        if (!inputValidator()) {
            System.out.printf("%dA%dB", aCount, bCount);
            System.out.println();
        }
        aCount = 0;
        bCount = 0;
    }

}
