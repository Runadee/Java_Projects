package week_4.adventureGame;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String characterName;

    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void selectCharacter() {

        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println();
        System.out.println("-------- Characters List -------- ");

        for (GameCharacter gameCharacter : characterList) {
            System.out.println("ID:" + gameCharacter.getId() +
                    ", Character:" + gameCharacter.getName() +
                    ", Damage:" + gameCharacter.getDamage() +
                    ", Health:" + gameCharacter.getHealth() +
                    ", Money:" + gameCharacter.getMoney());
        }
        System.out.println("-------------------------------");
        System.out.print("Enter a character id : ");
        System.out.println();


        int selectedCharacter = input.nextInt();
        switch (selectedCharacter) {
            case 1:
                initialPlayer(new Samurai());
                break;
            case 2:
                initialPlayer(new Archer());
                break;
            case 3:
                initialPlayer(new Knight());
                break;
        }
        System.out.println("Character: " + this.getCharacterName() +
                "  Damage: " + this.getDamage() +
                "  Health: " + this.getHealth() +
                "  Money : " + this.getMoney());
    }


    public void initialPlayer(GameCharacter gameCharacter) {
        this.setCharacterName(gameCharacter.getName());
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOriginalHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
    }

    public void printInfo() {
        System.out.println("Weapon : " + this.getInventory().getWeapon().getName() +
                ", Armor : " + this.getInventory().getArmor().getName() +
                ", Prevention : " + this.getInventory().getArmor().getPrevention() +
                ", Damage : " + this.getDamage() +
                ", Health : " + this.getHealth() +
                ", Money : " + this.getMoney());
    }

    public void claimReward(String reward) {
        getInventory().addItem(reward);
    }


}
