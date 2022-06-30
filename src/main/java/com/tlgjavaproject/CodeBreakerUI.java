package com.tlgjavaproject;


public class CodeBreakerUI extends CodeBreaker {

    public static void main(String[] args) {

        CodeBreaker playerGuess = new CodeBreaker();

        playerGuess.welcomeMessage();

        playerGuess.answerGenerator();

        do {
            playerGuess.playerEntry();

            if (inputValidator()) {
                System.out.println("Duplicate entry detected, please try again.");
                attemptsLeft++;
            }

            if (answer.equals(input)) {
                System.out.println("WELL DONE!");
                System.out.println("YOU BROKE THE CODE!");
                break;
            }

            playerGuess.compareInput();
            if (attemptsLeft > 1 && !inputValidator()) {
                System.out.println("Please try again, you have " + (attemptsLeft - 1) + " attempts left");
            }
            attemptsLeft--;
            input.clear();
        } while (attemptsLeft > 0);

        if (attemptsLeft == 0) {
            System.out.println("THANKS FOR PLAYING. The answer is " + answer + ".");
        }

    }

}
