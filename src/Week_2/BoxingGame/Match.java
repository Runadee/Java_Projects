package Week_2.BoxingGame;

public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("======= New Round =======");
                if (Math.random() < 0.5) {
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    if (isWin()) break;
                } else {
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    if (isWin()) break;
                }
                System.out.println("John health : " + this.fighter2.health);
                System.out.println("Jack health : " + this.fighter1.health);
            }
        } else {
            System.out.println("The weights of the athletes do not match.");
        }
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println("The Winner is " + this.fighter2.name);
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println("The Winner is " + this.fighter1.name);
            return true;
        }
        return false;
    }

}
