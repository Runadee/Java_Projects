package week_5.patika_store;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Product {

    private int batteryPower;
    private String color;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> mobilePhoneList = new ArrayList<>();

    public MobilePhone(int id, int price, double discount, int stock, String name, String brand, int memory, double inch, int ram, int batteryPower, String color) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public void initializeMobilePhoneList() {
        mobilePhoneList.add(String.valueOf(new MobilePhone(100, 30000, 0.1, 10, "Galaxy S23", "Samsung", 128, 6.1, 6, 4000, "Black")));
        mobilePhoneList.add(String.valueOf(new MobilePhone(200, 25000, 0.2, 15, "iPhone 12", "Apple", 64, 6.1, 6, 4000, "Blue")));

    }


}
