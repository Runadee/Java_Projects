package week_1;

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculateGPA {
    public static void main(String[] args) {
        // create variables
        int math , physic, chemic, music , history ,geography;

        // defined our scanner class
        Scanner input = new Scanner(System.in);

        // get values from user
        System.out.print("your math grade : ");
        math = input.nextInt();

        System.out.print("your physic grade: ");
        physic = input.nextInt();

        System.out.print("your chemical grade: ");
        chemic = input.nextInt();

        System.out.print("your music grade: ");
        music = input.nextInt();

        System.out.print("your history grade: ");
        history = input.nextInt();

        System.out.print("your geography grade: ");
        geography = input.nextInt();

        int total = (math+chemic+physic+music+geography+history);
        double result = total / 6.0;
        System.out.println("Your GPA " + result);

        boolean condition = (result >= 60);
        String passed = "Passed your exam";
        String failed = "Failed your exam";

        String result1 = condition ? passed : failed;

        System.out.println(result1);













    }
}