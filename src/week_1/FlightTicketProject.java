package week_1;

import java.util.Scanner;

public class FlightTicketProject {
    public static void main(String[] args) {

        int km, yas, yon;
        double normalTutar, indirimliTutar, ciftYonTutari;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.println("Gidilecek mesafeyi giriniz :");
        km = input.nextInt();
        System.out.println("Tek yön için 1 , Çift yön için 2 ye basınız.");
        yon = input.nextInt();

        normalTutar = 0.10 * km;
        if (yas <= 0 || km <= 0 || yon <= 0) {
            System.out.println("Geçersiz bir değer girdiniz.");
        } else {
            while (yon == 1) {
                if (yas < 12) {
                    indirimliTutar = normalTutar - (normalTutar * 0.5);
                } else if (yas >= 12 && yas < 24) {
                    indirimliTutar = normalTutar - (normalTutar * 0.1);
                } else if (yas >= 65) {
                    indirimliTutar = normalTutar - (normalTutar * 0.3);
                } else {
                    indirimliTutar = normalTutar;
                }
                System.out.println("Bilet ücreti : " + indirimliTutar);
                break;
            }
            while (yon == 2) {
                if (yas < 12) {
                    indirimliTutar = normalTutar - (normalTutar * 0.5);
                    ciftYonTutari = (indirimliTutar * 0.2) * 2;
                } else if (yas >= 12 && yas < 24) {
                    indirimliTutar = normalTutar - (normalTutar * 0.1);
                    ciftYonTutari = (indirimliTutar * 0.2) * 2;
                } else if (yas >= 65) {
                    indirimliTutar = normalTutar - (normalTutar * 0.3);
                    ciftYonTutari = (indirimliTutar * 0.2) * 2;
                } else {
                    ciftYonTutari = 2 * normalTutar;
                }
                System.out.println("Bilet ücreti : " + ciftYonTutari);
                break;
            }
        }
    }
}