package week_1;// Calculator App using Switch-case in Java
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // create values
        int n1 , n2 , select ;

        // defined Scanner Class
        Scanner input = new Scanner(System.in);

        // take values for n1, n2 from users
        System.out.print("Enter the first number : ");
        n1 = input.nextInt();

        System.out.print("Enter the second number : ");
        n2 = input.nextInt();

        // enter the operator selection  to use.
        System.out.println("1-Addition\n2-subtraction\n3-multiplication\n4-division");
        System.out.print("Your selection : ");
        select = input.nextInt();
        input.close();

        // Let's compile our conditional codes with the Switch-Case structure
        switch (select){
            case 1:
                System.out.print("Addition : " + (n1 +n2));
                break;
            case 2:
                System.out.print("subtraction : " + (n1 - n2));
                break;
            case 3:
                System.out.print("multiplication : " + (n1 * n2));
                break;
            case 4:
                // A number cannot be divided by 0.
                if (n2 != 0){
                System.out.print("division : " + (n1 / n2));
                break;

            }else{ //  If the person gives a value of 0, the answer that will be returned is.
                    System.out.print("A number cannot be divided by 0. Please make a valid transaction.\n");
                    break;
                }

            //default response if person makes wrong choice
            default:
                System.out.print("You entered an incorrect value! Please try again.\n");
        }


    }
}