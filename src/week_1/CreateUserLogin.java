package week_1;

import java.util.Scanner;

public class CreateUserLogin {
    public static void main(String[] args) {
        // create values
        String userName, password, newPassword;
        int answer ;

        // defined Scanner class
        Scanner input = new Scanner(System.in);

        // take values from users
        System.out.print("Your Username : ");
        userName = input.nextLine();

        System.out.print("Your Password: ");
        password = input.nextLine();

        // conditions to check the accuracy of user information
        if (userName.equals("developerEdanur") && password.equals("fullstack123")){
            System.out.print("Successfully logged in ! ");
        } else {
            System.out.println("Login Failed ! Do you want to reset your password ? ");
            System.out.println("1-Yes\n2-No");
            answer = input.nextInt();
            input.nextLine();

            // Selected 1-Yes
            if (answer == 1) {
                System.out.print("Please enter your new password : ");
                newPassword = input.nextLine(); // created new password

                // check for same password
                if (newPassword.equals("fullstack123")){
                    System.out.println("Don't use your previous password !");// cannot use previous password
                    // request again a new password
                    System.out.print("The password could not be created, please enter another password: ");
                    newPassword = input.nextLine();
                    if(newPassword != password){
                        System.out.print("Password created ! ");
                    }
                } else{
                    System.out.print("Password created ! ");
                }
                // selected 2-No
            }else {
                System.out.print("Login Failed ! ");

            }
        }

    }
}