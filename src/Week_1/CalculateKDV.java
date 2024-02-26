package Week_1;

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculateKDV {
    public static void main(String[] args) {

        // create variables
        double value ;

        // defined our scanner class
        Scanner input = new Scanner(System.in);

        //take values from users
        System.out.print("Enter a currency value :  ");
        value = input.nextDouble();

        // create variables with different KDV rates
        double kDVamount1 = value * 0.18;
        double kDVamount2 = value * 0.08;
        double withKDV1 = value + kDVamount1;
        double withKDV2 = value + kDVamount2;

        // conditional calculation by quantity
        double condition = (value <= 1000) ? withKDV1 : withKDV2 ;


        System.out.println("Your currency value: "+ value);
        System.out.println("Your currency value with KDV: " + condition);




    }
}