package week_6.notePad;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome Edanur's NotePad App !");
            System.out.println("1. Enter Text ");
            System.out.println("2. Read saved text");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();// Clear the newline character left behind by nextInt

            switch (choice) {
                case 1:
                    enterTextAndSave(input);
                    break;
                case 2:
                    readSavedText();
                    break;
                case 3:
                    System.out.println("You logged out.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }

    }

    // Method to enter text and save it to a file
    private static void enterTextAndSave(Scanner input) {
        System.out.println("Enter a text: ");
        String text = input.nextLine();

        try (FileWriter fileWriter = new FileWriter("notes.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.print(text);
            System.out.println("Text successfully saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read saved text from file
    private static void readSavedText() {
        try (FileReader fileReader = new FileReader("notes.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String readText = bufferedReader.readLine();

            if (readText != null) {
                System.out.println("Saved text: " + readText);
            } else {
                System.out.println("There is no text saved.");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

    }

}
