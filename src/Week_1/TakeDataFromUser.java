package Week_1;

import java.util.Scanner;

public class TakeDataFromUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Name: " );
        String Name = input.nextLine();
        System.out.println("Surname: " );
        String Surname = input.nextLine();
        System.out.println("Age : " );
        int Age = input.nextInt();
        System.out.println("Salary : " );
        double Salary = input.nextDouble();

        System.out.println("Name: " + Name);
        System.out.println("Surname: " + Surname);
        System.out.println("Age : " + Age);
        System.out.println("Salary : " + Salary);
    }
}