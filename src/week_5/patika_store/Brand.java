package week_5.patika_store;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Brand {
    int id;
    String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void createBrands() {
        ArrayList<String> brandList = new ArrayList<>();
        brandList.add("Samsung");
        brandList.add("Lenovo");
        brandList.add("Apple");
        brandList.add("Huawei");
        brandList.add("Casper");
        brandList.add("Asus");
        brandList.add("HP");
        brandList.add("Xiaomi");
        brandList.add("Monster");
    }
}
