package week_2;

import java.util.Arrays;

public class DuplicateArrays {

    static boolean isEvenNumber(int value) {
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        int list[] = {3, 5, 8, 9, 8, 10, 11, 5, 11, 8, 7, 4, 16, 8};
        int duplicate[] = new int[list.length]; // duplicates array
        int evenDuplicate[] = new int[duplicate.length]; // even duplicates array
        int count = 0; // count of duplicate elements

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    duplicate[count] = list[i]; // storing duplicate element
                    if (isEvenNumber(list[i])) {
                        evenDuplicate[count] = list[i]; // storing even duplicate element
                    }
                    count++;
                    break; // break inner loop once a duplicate is found
                }
            }
        }

        // printing duplicate elements
        System.out.println("Duplicate elements: " + Arrays.toString(Arrays.copyOf(duplicate, count)));
        // printing even duplicate elements
        System.out.println("Even Duplicate elements: " + Arrays.toString(Arrays.copyOf(evenDuplicate, count)));
    }
}
