package week_2;

import java.util.Scanner;

public class MinMaxArray {

        public static void main(String[] args) {
            int[] list = {56, 34, 1, 8, 101, -2, -33};
            Scanner inp = new Scanner(System.in);

            System.out.println("Please enter a number : ");
            int number = inp.nextInt();
            inp.close();

            int min = list[0];
            int max = list[0];

            for (int i : list) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }

            System.out.println("Minimum Değer " + min);
            System.out.println("Maximum Değer " + max);

        }
    }

