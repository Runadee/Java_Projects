package week_5.patika_store;

public class NoteBook extends Product {
    int ram;
    int storage;
    double screenSize;

    public NoteBook(int id, double price, double discountRate, int stock, String name, Brand brand, int ram, int storage, double screenSize) {
        super(id, price, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}
