package week_5.patika_store;

import java.util.ArrayList;
import java.util.Collections;

public class Brand {
    private int id;
    private String name;
    private static ArrayList<String> brands = new ArrayList<>();

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static {

        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiaomi");
        brands.add("Monster");


    }

    public Brand() {

    }

    public boolean printBrands() {
        Collections.sort(brands);

        for (String brand : brands) {
            System.out.println(brand);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
