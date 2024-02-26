package week_2;

import java.util.Scanner;

public class RecursiveExponential {

    static int exponential(int numb1, int numb2) {
        if (numb2 == 0) {
            return 1;
        } else {
            int result = numb1 * exponential(numb1, numb2 - 1);
            return result;
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int numb1 = input.nextInt();
        System.out.println("Please enter the second number :");
        int numb2 = input.nextInt();

        System.out.println("Exponential Result : " + exponential(numb1, numb2));

    }


}