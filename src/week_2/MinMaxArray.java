package week_2;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int number = inp.nextInt();
        inp.close();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int insertionPoint = Arrays.binarySearch(list, number);
        System.out.println(insertionPoint);
        System.out.println((-(insertionPoint) - 1));

        while (true) {
            if ((-(insertionPoint) - 1) == 0) {
                System.out.println("Max: " + list[0]);
                System.out.println("Min: " + number);
                break;
            } else if ((-(insertionPoint) - 1) >= list.length) {
                System.out.println("Max: " + number);
                System.out.println("Min: " + list[list.length - 1]);
                break;
            }
            System.out.println("Max: " + list[(-(insertionPoint) - 1)]);
            System.out.println("Min: " + list[(-(insertionPoint) - 1) - 1]);
            break;
        }

    }

}

