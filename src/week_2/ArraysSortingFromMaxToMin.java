package week_2;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysSortingFromMaxToMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println("Büyükten küçüğe sıralanmış dizi:");

        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i] + " ");
        }
    }
}


