package week_5.patika_store;

import java.util.ArrayList;

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

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
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

    // Override method to display the list of mobile phones


    @Override
    public void showProductList() {
        System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                "ID", "Product Name", "Price", "Discount", "Stock", "Brand", "Storage", "Screen", "RAM", "Battery", "Color");

        for (MobilePhone phone : phones) {
            System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getDiscount(), phone.getStock(), phone.getBrand(),
                    phone.getMemory(), phone.getInch(), phone.getRam(), phone.getBatteryPower(), phone.getColor());
        }
    }

    @Override
    public void addProduct() {

        System.out.println("Please enter a new ID:");
        int newPhoneID = input.nextInt();
        input.nextLine();

        if (findPhoneById(newPhoneID) == null) {
            System.out.println("Please enter the product name:");
            String newPhoneName = input.nextLine();

            System.out.println("Please enter the brand:");
            String newPhoneBrand = input.nextLine();

            System.out.println("Please enter the price:");
            int newPhonePrice = input.nextInt();

            System.out.println("Please enter the discount rate:");
            double newPhoneDiscount = input.nextDouble();

            System.out.println("Please enter the stock information:");
            int newPhoneStock = input.nextInt();
            input.nextLine();

            System.out.println("Please enter the storage size:");
            int newPhoneStorage = input.nextInt();
            input.nextLine();

            System.out.println("Please enter the screen size:");
            double newPhoneScreenSize = input.nextDouble();

            System.out.println("Please enter the RAM (in GB):");
            int newPhoneRam = input.nextInt();
            input.nextLine();

            System.out.println("Please enter the color:");
            String newPhoneColor = input.nextLine();

            System.out.println("Please enter the battery power:");
            int newPhoneBatterySize = input.nextInt();

            phones.add(new MobilePhone(newPhoneID, newPhonePrice, newPhoneDiscount, newPhoneStock, newPhoneName,
                    newPhoneBrand, newPhoneStorage, newPhoneScreenSize, newPhoneRam, newPhoneBatterySize, newPhoneColor));

            System.out.println("New mobile phone added.");
            System.out.println("----------------------");

        } else {
            System.out.println("This product has already been added. Please try again.");
        }

    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter the ID of the product you want to delete:");
        int deleteSelection = input.nextInt();

        MobilePhone phoneToDelete = findPhoneById(deleteSelection);

        if (phoneToDelete != null) {
            phones.remove(phoneToDelete);
            System.out.println("Product deleted.");

        } else {
            System.out.println("ID not found.");
        }

    }

    @Override
    public void filterByProductBrand() {
        System.out.println("Enter the brand you want to filter:");
        String filterBrand = input.next();

        System.out.println("Filter results:");
        for (MobilePhone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(filterBrand)) {
                System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                        phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand(),
                        phone.getMemory(), phone.getInch(), phone.getRam(), phone.getBatteryPower(),
                        phone.getColor(), phone.getStock(), phone.getDiscount());
            }
        }

    }

    @Override
    public void filterByProductID() {
        System.out.println("Enter the ID you want to filter:");
        int filterID = input.nextInt();

        MobilePhone filteredPhone = findPhoneById(filterID);

        if (filteredPhone != null) {
            System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s%n",
                    "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM", "Battery", "Color", "Stock", "Discount");

            System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                    filteredPhone.getId(), filteredPhone.getName(), filteredPhone.getPrice(),
                    filteredPhone.getBrand(), filteredPhone.getMemory(), filteredPhone.getInch(),
                    filteredPhone.getRam(), filteredPhone.getBatteryPower(), filteredPhone.getColor(),
                    filteredPhone.getStock(), filteredPhone.getDiscount());
        } else {
            System.out.println("No product found by ID.");
        }

    }

    private MobilePhone findPhoneById(int id) {
        for (MobilePhone phone : phones) {
            if (phone.getId() == id) {
                return phone;
            }
        }
        return null;
    }


}
