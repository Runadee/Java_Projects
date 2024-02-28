package week_2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random randomObject = new Random();
        int number = randomObject.nextInt(100);
        // int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        while (right < 5) {
            System.out.println("Please enter your guess number : ");
            int selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Invalid Value! Please enter a value between 0 and 100.");
                continue;
            }
            if (selected == number) {
                System.out.println("Congrats ! ");
                break;
            } else {
                System.out.println("Sorry ! You didn't guess.");
                if (selected > number) {
                    System.out.println(selected + " is bigger than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }
            }
            right++;
        }
        System.out.println(number);
    }
}
