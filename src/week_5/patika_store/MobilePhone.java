package week_5.patika_store;

public class MobilePhone extends Product {
    int memory;
    double screenSize;
    double batteryPower;
    int ram;
    String color;

    public MobilePhone(int id, double price, double discountRate, int stock, String name, Brand brand, int memory, double screenSize, double batteryPower, int ram, String color) {
        super(id, price, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
}
