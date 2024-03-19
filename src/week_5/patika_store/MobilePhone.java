package week_5.patika_store;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Product {

    private int batteryPower;
    private String color;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> mobilePhoneList = new ArrayList<>();

    public MobilePhone(int id, int price, int discount, int stock, String name, String brand, int memory, int inch, int ram) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
    }

    public void initializeMobilePhoneList() {

    }


}
