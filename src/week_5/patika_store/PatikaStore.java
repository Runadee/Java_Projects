package week_5.patika_store;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {

    static ArrayList<Brand> brands = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        initializeBrands();
        iniitializeProducts();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Patika Store !");
            System.out.println("1 - Notebook");
            System.out.println("2 - Mobile Phone");
            System.out.println("3 - Brands List");
            System.out.println("0 - Exit");
            System.out.println(" Your choice : ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Logged out !");
                    return;
                case 1:
                    listNoteBooks();
                    break;
                case 2:
                    listMobilePhones();
                    break;
                case 3:
                    listBrands();
                    break;
                default:
                    System.out.println("Invalid Values !");
            }
        }
    }


}
