package week_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random randomObject = new Random();
        int number = randomObject.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("Please enter your guess number : ");
            int selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Invalid Value! Please enter a value between 0 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You entered many times incorrectly , remaining right: " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("The next time you enter incorrectly, your right will be decremented.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congrats ! ");
                isWin = true;
                break;
            } else {
                System.out.println("Sorry ! You didn't guess.");
                if (selected > number) {
                    System.out.println(selected + " is bigger than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Your remaining right : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("You failed !");
            System.out.println("Your guesses : " + Arrays.toString(wrong));
        }
        System.out.println("The secret number is : " + number);
    }
}
