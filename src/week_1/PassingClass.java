package week_1;/* Passing grade calculation program that prevents
   invalid grades from being entered into the system
    @author Edanur Gurgen
    @since February 2024
    */

import java.util.Scanner;

public class PassingClass {
    public static void main(String[] args) {

        // create valuables ; lessons and the denominator to divide
        float math , music, history , physic , chemic , result;
        int divisor = 0 ;

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // get the values from the user and evaluate with conditions
        System.out.print("Please enter your math grade: ");
        math = input.nextFloat();
        if (0<math && math<=100){
            divisor += 1;
        } else {// If an invalid grade is entered
            System.out.println("Invalid grade !");
        }

        System.out.print("Please enter your music grade: ");
        music = input.nextFloat();
        if (0<music && music<=100){
            divisor += 1;
        } else {// If an invalid grade is entered
            System.out.println("Invalid grade !");
        }
        System.out.print("Please enter your history grade: ");
        history = input.nextFloat();
        if (0<history && history<=100){
            divisor += 1;
        } else {// If an invalid grade is entered
            System.out.println("Invalid grade !");
        }

        System.out.print("Please enter your physic grade: ");
        physic = input.nextFloat();
        if (0<physic && physic<=100){
            divisor += 1;
        } else {// If an invalid grade is entered
            System.out.println("Invalid grade !");
        }

        System.out.print("Please enter your chemic grade: ");
        chemic = input.nextFloat();
        if (0<chemic && chemic<=100){
            divisor += 1;
        } else { // If an invalid grade is entered
            System.out.println("Invalid grade !");
        }

        // print result and set passing average
        result = (math+music+history+physic+chemic) / divisor; //GPA calculation
        if (result >= 55){
            System.out.println("Average : "+ result);
            System.out.print("Congratulations ! You Passed !");
        }else{// If grade is less than 55
            System.out.println("Average : "+ result);
            System.out.print("Sorry ! you haven't passed yet , but keep going :)");
        }

    }
}