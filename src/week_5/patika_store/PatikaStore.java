package week_5.patika_store;


import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    private boolean isMenu = true;


    public void showMenu() {

        while (isMenu) {
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
                    isMenu = false;
                    break;
                case 1:
                    NoteBook noteBook = new NoteBook();

                    break;
                case 2:
                    System.out.println("Cep Telefonları");
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrand();
                    break;
                default:
                    System.out.println("Invalid option , please try again.");

            }

        }

    }


}