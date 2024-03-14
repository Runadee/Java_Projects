package week_3.minesweeperGame;

import java.util.Scanner;

// Main class to start the Minesweeper game
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome message and prompt for game sizes
        System.out.println("Welcome to the Minesweeper Game!");
        System.out.println("Please enter the game sizes you want to play. ");

        System.out.print("Row size :");
        int row = input.nextInt();
        System.out.print("Column size :");
        int column = input.nextInt();

        // Create an instance of the MineSweeper class
        MineSweeper mineSweeper = new MineSweeper(row, column);

        // Check if the game board size is valid and start the game
        if ((row >= 2) && (column >= 2)) {
            mineSweeper.run();
        } else {
            // Prompt to select a valid game board size
            System.out.println("You should select minimum 2 x 2 game board to start !");
        }
    }
}
