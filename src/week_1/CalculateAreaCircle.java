package week_1;
// program to calculate the area of a circle

import java.util.Scanner;

public class CalculateAreaCircle {
    public static void main(String[] args) {

        // create variables
        int r ;
        double pi = 3.14;

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // take values from users
        System.out.print("enter the radius of the circle : ");
        r = input.nextInt();

        // Formul : (pi * (r*r) * 𝛼) / 360
        double angle = 360 / ( pi * r * r);

        // take values from users
        System.out.print("enter measure of central angle : ");
        angle = input.nextDouble();

        // defined area formula
        double area =  pi * r * r;

        System.out.print("Area of the circle : " + area);

    }
}