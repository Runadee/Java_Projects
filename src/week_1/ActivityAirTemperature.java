package week_1;// activity according to air temperature with if-else structure
import java.util.Scanner;

public class ActivityAirTemperature {
    public static void main(String[] args) {

        // create values
        int heat ;

        // defined Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the heat : ");
        heat = input.nextInt();

        // evaluate the conditions with activities
        if (heat < 5){
            System.out.print("the weather is cold, but you can have a pleasant time skiing.");
        } else if (heat <= 5 && heat <= 15) {
            System.out.print("It's a pretty nice day to go to the movies .");
        } else if (heat >=15 && heat <=25 ) {
            System.out.print("It would be very enjoyable to go on a picnic.");
        } else {
            System.out.print("The weather is quite warm, suitable for swimming.");
        }

    }
}

