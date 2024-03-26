package week_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaYolu = "/Users/eda/IdeaProjects/JavaProjects/src/week_6/dosya.txt";
        int toplam = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                // Satırı tam sayıya dönüştürüp toplama ekliyoruz
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }
            System.out.println("Toplam: " + toplam);
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Geçersiz sayı formatı: " + e.getMessage());
        }
    }
}


