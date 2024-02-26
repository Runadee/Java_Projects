package week_2;

import java.util.Scanner;

public class DizilerdeOrtalamaHesabı {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        int[] dizi = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        System.out.println("Dizinin ortalaması " + (toplam / dizi.length));
    }
}

