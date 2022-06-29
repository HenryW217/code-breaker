package com.tlgjavaproject;

import java.util.ArrayList;
import java.util.Collections;

public class CodeBreakerUI extends CodeBreaker {

    public static void main(String[] args) {


        CodeBreaker playerGuess = new CodeBreaker();

        playerGuess.welcomeMessage();

        playerGuess.answerGenerator();
        System.out.println("***Test purpose only, the answer is: " + answer + " ***"); // TODO !!!This line is to test only, remove after code complete!!!


        do {
            playerGuess.playerEntry();

            if (inputValidator(input) == true){
                System.out.println("Invalidated entry, please try again.");
                attemptsLeft++;
            }


            if (answer.equals(input)){
                System.out.println("WELL DONE!");
                System.out.println("YOU BROKE THE CODE!");
                break;
            }
            playerGuess.compareInput();
            if (attemptsLeft >1 && inputValidator(input) == false){
                System.out.println("Please try again, you have " + (attemptsLeft - 1) + " attempts left");

            }
            attemptsLeft--;
            input.clear();


        } while (attemptsLeft > 0);

        if (attemptsLeft == 0){
            System.out.println("THANKS FOR PLAYING. The answer is " + answer +".");
        }


    }






}
