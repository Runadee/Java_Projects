package week_5.patika_store;


import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    private boolean isMenu = true;


    public void showMenu() {

        while (isMenu) {
            System.out.println();
            System.out.println("--PatikaStore Product Management Panel--");
            System.out.println("1 - Notebook Operations");
            System.out.println("2 - Mobile Phone Operations");
            System.out.println("3 - List Brands");
            System.out.println("0 - Exit");
            System.out.println();
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Çıkış Yaptınız ");
                    isMenu = false;
                    break;
                case 1:
                    NoteBook noteBook = new NoteBook();
                    noteBook.runMenu();
                    break;
                case 2:
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.runMenu();
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