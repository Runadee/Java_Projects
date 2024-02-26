package Week_1;// Body Mass Index calculation program
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        // create variables
        double height , weight ;

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // take values from users
        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight (in kg): ");
        weight = input.nextDouble();

        // Formul to calculate Body Mass Index
        double bmi = weight / ( height * height);

        // print output
        System.out.print("Your Body Mass Index : " + bmi);

    }
}