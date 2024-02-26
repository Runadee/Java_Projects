package Week_1;

import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom(int number){

        int temp = number , reverseNumber=0, lastNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter a number :");
        number = scan.nextInt();

        while(temp != 0){

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber )
            return  true;
        else
            return false;
    }

    public static void main(String[] args) {
     System.out.println(isPalindrom(4));
    }
}