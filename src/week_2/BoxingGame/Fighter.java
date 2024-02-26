package week_2.BoxingGame;

public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;

    Fighter(String name, int health, int damage, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) this.dodge = dodge;
        else this.dodge = 0;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " caused " + this.damage + " damage.");
        if (foe.isDodge()) {
            System.out.println("incoming damage is blocked.");
            return foe.health;
        }
        return Math.max(foe.health - this.damage, 0);
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}
