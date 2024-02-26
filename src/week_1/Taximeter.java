package week_1;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        // create variables
        double pathTaken , taximeterRate= 2.20 , openingFee= 10.0 ;

        // defined our Scanner class
        Scanner input = new Scanner(System.in);

        // take values from user
        System.out.print("distance traveled in km :  ");
        pathTaken = input.nextDouble();

       // create  total fee value and conditional results
       double total = ((pathTaken * 2.20 ) + openingFee);
       double result1 = 20.0;
       double result2 = total;

       // defined our condition for taximetre
       double condition = (total <= 20.0) ? result1 : result2 ;

       // print taximeter amount
       System.out.print("Your taximeter amount : " + condition );


    }
}