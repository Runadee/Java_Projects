package Week_1;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {

        int a, b, c ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number for a : ");
        a = input.nextInt();

        System.out.print("Please enter a number for b : ");
        b = input.nextInt();

        System.out.print("Please enter a number for c : ");
        c = input.nextInt();

        if((a>b) && (a>c)){
                if (b>c){
                    System.out.print("a>b>c");
                }else{
                    System.out.print("a>c>b");
                }
        } else if ((b>a) && (b>c)) {
                if (a>c){
                    System.out.print("b>a>c");
                }else{
                    System.out.print("b>c>a");
                }
        } else{
               if (a>b){
                   System.out.print("c>a>b");
               }else {
                   System.out.print("c>b>a");
               }
        }


    }
}