package Week_1;

import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {

        // create values
        int a, b ;
        double c;

        // defined our scanner class
        Scanner input = new Scanner(System.in);

        // take values from users
        System.out.print("first value of  triangle : ");
        a = input.nextInt();

        System.out.print("second value of  triangle :  ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("Hypotenuse : " + c );


    }
}