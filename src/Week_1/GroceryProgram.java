package Week_1;// Grocery Program in Java
import java.util.Scanner;


public class GroceryProgram {
    public static void main(String[] args) {

        // Create values
        double p,a,t,b,e; //  represents how many kg the customer wants to buy.

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // take values per kg for each fruit and vegetable from the customer .
        System.out.print("How Many Kilos of pears ? : ");
        p = input.nextDouble();

        System.out.print("How Many Kilos of apple ? :");
        a = input.nextDouble();

        System.out.print("How Many Kilos of tomato ? :");
        t = input.nextDouble();

        System.out.print("How Many Kilos of banana ? :");
        b = input.nextDouble();

        System.out.print("How Many Kilos of eggplant ? :");
        e = input.nextDouble();

        // the final amount the customer will pay
        double total = (p * 2.14)+(a * 3.67)+(t * 1.11)+(b * 0.95)+(e *5.00);

        // let's print the result
        System.out.print("total amount :  " + total);

    }
}