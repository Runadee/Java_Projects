package week_5.patika_store;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class MobilePhone extends Product implements Operation {

    private int batteryPower;
    private String color;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<MobilePhone> phones = new ArrayList<>();

    public MobilePhone(int id, int price, double discount, int stock, String name, String brand, int memory, double inch, int ram, int batteryPower, String color) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    // default Constructor method ( non-parameterized)
    public MobilePhone() {

    }

    public void initializeMobilePhoneList() {
        phones.add(new MobilePhone(100, 30000, 0.1, 10, "Galaxy S23", "Samsung", 128, 6.1, 6, 4000, "Black"));
        phones.add(new MobilePhone(200, 25000, 0.2, 15, "iPhone 12", "Apple", 64, 6.1, 6, 4000, "Blue"));

    }

    @Override
    public void runMenu() {
        MobilePhone phoneManager = new MobilePhone();

        while (true) {
            System.out.println("\nMobile Phones management panel");
            System.out.println("1- List Mobile Phones");
            System.out.println("2- Add Mobile Phone");
            System.out.println("3- Delete Mobile Phone");
            System.out.println("4- Filter By ID");
            System.out.println("5- Filter By Brand");
            System.out.println("0- Main Menu");

            System.out.println("Enter your selection :");
            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Returning to the main menu");
                    return;
                case 1:
                    phoneManager.showProductList();
                    break;
                case 2:
                    phoneManager.addProduct();
                    break;
                case 3:
                    phoneManager.deleteProduct();
                    break;
                case 4:
                    phoneManager.filterByProductID();
                    break;
                case 5:
                    phoneManager.filterByProductBrand();
                    break;
                default:
                    System.out.println("Invalid option , please try again.");
            }
        }
    }

    @Override
    public void showProductList() {


    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductBrand() {

    }

    @Override
    public void filterByProductID() {

    }
}
