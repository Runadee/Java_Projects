package week_3.minesweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber; // Number of rows in the game field
    int columnNumber; // Number of columns in the game field
    String[][] mineMap; // Map where mines are located
    String[][] gameMap; // Map seen by the player
    int mineNumber; // Total number of mines
    int selectedRow; // Selected row by the player
    int selectedColumn; // Selected column by the player
    int count; // Number of mines around the selected cell
    boolean isTrue = true; // Flag to control game continuation

    // Constructor method
    public MineSweeper(int row, int column) {
        this.rowNumber = row;
        this.columnNumber = column;
        this.gameMap = new String[row][column];
        this.mineMap = new String[row][column];
        this.mineNumber = (row * column) / 4; // Calculate number of mines
    }

    // Initialize the game maps with "-" symbol
    public void initializeMaps() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    // Randomly place mines using the Random library
    public void randomMinePlacement() {
        Random random = new Random();
        for (int i = 0; i < this.mineNumber; i++) {
            int randomRow = random.nextInt(this.rowNumber);
            int randomColumn = random.nextInt(this.columnNumber);
            if (!this.mineMap[randomRow][randomColumn].equals("*")) {
                this.mineMap[randomRow][randomColumn] = "*";
            }
        }
    }

    // Print the initial mine map when the game starts
    public void printInitialMineMap() {
        System.out.println("Mines Placement");
        randomMinePlacement();
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.columnNumber; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Minesweeper Game Started !");
    }

    // Select the cell to play and continue until wrong input or game ends
    public void selectCellAndPlay() {
        Scanner inp = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.print("Select row : ");
            selectedRow = inp.nextInt();
            System.out.print("Select column : ");
            selectedColumn = inp.nextInt();
            if (selectedRow > rowNumber || selectedColumn > columnNumber) {
                System.out.println("You have chosen different game sizes, please try again. !");
                continue;
            }
            if (mineMap[selectedRow][selectedColumn].equals("*")) {
                System.out.println("Game Over!");
                break;
            }
            calculateAdjacentMineCounts();
            if (checkGameCompletion()) {
                System.out.println("Congratulations! You have successfully completed the game.");
                break;
            }
        }
    }

    // Calculate the number of mines around the selected cell or print 0 as initial count
    public void calculateAdjacentMineCounts() {
        count = 0;
        for (int i = (selectedRow - 1); i <= (selectedRow + 1); i++) {
            for (int j = (selectedColumn - 1); j <= (selectedColumn + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.columnNumber) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[selectedRow][selectedColumn] = String.valueOf(count);
        this.mineMap[selectedRow][selectedColumn] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.columnNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // Check if the game is completed by checking for remaining "-" fields in the game
    public boolean checkGameCompletion() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.columnNumber; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to start the game, called in the main class
    public void run() {
        initializeMaps();
        printInitialMineMap();
        selectCellAndPlay();
    }
}
