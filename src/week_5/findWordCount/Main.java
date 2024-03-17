package week_5.findWordCount;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text :");
        String text = input.nextLine();

        String[] words = text.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            wordCounts.put(lowercaseWord, wordCounts.getOrDefault(lowercaseWord, 0) + 1);
        }

        String mostFrequentWord = " ";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most frequent word : " + mostFrequentWord + " " + maxCount + " times.");
    }
}
