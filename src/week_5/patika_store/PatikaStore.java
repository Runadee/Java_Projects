package week_5.patika_store;


import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Brand brand = new Brand();

        System.out.println("Patika Store ürün yönetim paneli !");
        System.out.println("1 - Notebook işlemleri");
        System.out.println("2 - Cep telefonu işlemleri");
        System.out.println("3 - Marka listele ");
        System.out.println("0 - Çıkış ");
        System.out.println("Seçiminiz : ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 0:
                System.out.println("Çıkış Yaptınız ");
                break;
            case 1:
                System.out.println("Notebooks");
                break;
            case 2:
                System.out.println("Cep Telefonları");
                break;
            case 3:
                System.out.println("Markalar");
                System.out.println(brand.printBrands());

        }
    }


}
