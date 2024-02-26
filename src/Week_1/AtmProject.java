package Week_1;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, amount;

        while (right > 0) {
            System.out.println("Enter your username :");
            userName = scan.nextLine();
            System.out.println("Enter your password : ");
            password = scan.nextLine();

            if (userName.equals("edanur") && password.equals("developer2024")) {
                System.out.println("Hello Edanur .How can I help you today ?");
                do {
                    System.out.println("Please select the option you want to do.\n : ");
                    System.out.println("1-top up money\n" + "2-withdraw money\n" + "3-balance inquiry\n" + "4-exit");
                    select = scan.nextInt();

                    switch (select){

                        case 1:
                                System.out.print("amount of money to be loaded: ");
                                amount = scan.nextInt();
                                balance += amount;
                                break;
                        case 2:
                                System.out.print("amount of money to be withdrawn :");
                                amount = scan.nextInt();
                                if (amount>balance){
                                    System.out.println("insufficient funds.");
                                }
                                balance -= amount;
                                break;
                        case 3:
                                System.out.println("your balance : "+ balance);
                                break;

                        default:
                                System.out.println("You have made an invalid action.");

                    }
                } while (select != 4);
                System.out.println("Have a good day Edanur. See you again !");
                break;
            } else {
                right--;
                System.out.println("You entered an incorrect username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println(" your remaining right :" + right);
                }
            }
        }
    }
}