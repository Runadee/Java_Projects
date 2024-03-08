package week_4.adventureGame;

import java.util.Scanner;

public class Player {
    //Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;
    private String characterName;

    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
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

    void selectCharacter() {

        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("----- Characters List ----- ");

        for (GameCharacter gameCharacter : characterList) {
            System.out.println("ID:" + gameCharacter.getId() +
                    ", Character:" + gameCharacter.getName() +
                    ", Damage:" + gameCharacter.getDamage() +
                    ", Health:" + gameCharacter.getHealth() +
                    ", Money:" + gameCharacter.getMoney());
        }
        System.out.print("Enter a character id : ");


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
        this.setMoney(gameCharacter.getMoney());
    }


}
