package Week_1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob=1;


        for(int k=n1; k>= 1; k--){
            if((n1 % k==0)&& (n2 % k==0)){
                ebob = k;
                break;
            }
        }

        for(int i=1; i<= (n1 * n2); i++){
            if((n1 % i==0)&& (n2 % i==0)){
                System.out.println(i);
                break;

            }
        }
        System.out.println((n1*n2)/ ebob);

    }
}