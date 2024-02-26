package week_1;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {

        // create values
        int a, b ,c  ;


        // defined our scanner class
        Scanner input = new Scanner(System.in);

        // take values from users
        System.out.print("first value of  triangle : ");
        a = input.nextInt();

        System.out.print("second value of  triangle :  ");
        b = input.nextInt();

        System.out.print("third value of triangle : ");
        c = input.nextInt();

        // perimeter of triangle = 2u
        double u = (a+b+c) / 2;

        // area calculation formula d = Alan * Alan
        double  d = u * (u - a)* (u - a) * (u - c) ;

       // take the square root to find the area
        double Alan = Math.sqrt(d);

        System.out.print("Area of triangle : " + Alan);




    }
}