package Week_1;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi yazin");
        int sayi=input.nextInt();
        int toplam = 0;
        for (int i = 1 ; i < sayi ; i++) {
            if(sayi %i == 0)
                toplam += i;
        }

        if (toplam == sayi)
            System.out.println(sayi + " mükemmel bir sayidir");
        else
            System.out.println(sayi + " mükemmel bir sayi degildir");


    }
}