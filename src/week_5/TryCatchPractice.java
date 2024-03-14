package week_5;

import java.util.ArrayList;
import java.util.Scanner;

public class TryCatchPractice {

    static int getElementFromArray(int[] list, int index) {
        if (index < 0 || index >= list.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return list[index];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter index number :");
        int index = input.nextInt();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            int element = getElementFromArray(list, index);
            System.out.println("The element at index " + index + " in the array is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The specified index is out of the array bounds.");
        }


    }
}
