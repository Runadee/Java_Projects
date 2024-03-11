package week_4.adventureGame;

public class Armor {
    private String name;
    private int id;
    private int prevention;
    private int price;

    public Armor(String name, int id, int prevention, int price) {
        this.name = name;
        this.id = id;
        this.prevention = prevention;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];

        armorList[0] = new Armor("light", 1, 10, 15);
        armorList[1] = new Armor("middle", 2, 10, 15);
        armorList[2] = new Armor("heavy", 3, 10, 15);

        return armorList;
    }

    public static Armor getArmorObjectByID(int id) {
        for (Armor armor : armors()) {
            if (armor.getId() == id) {
                return armor;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrevention() {
        return prevention;
    }

    public void setPrevention(int prevention) {
        this.prevention = prevention;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
