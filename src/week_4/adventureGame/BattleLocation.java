package week_4.adventureGame;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacleAmount;
    private boolean cleared;

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacleAmount) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacleAmount = maxObstacleAmount;
        this.cleared = false;
    }


    @Override
    public boolean onLocation() {

        if (cleared) {
            System.out.println("You have already cleared this location and claimed the reward.");
            return true;
        }

        int obstacleNumber = this.randomObstacleNumber();
        System.out.println("Now you're here : " + this.getName());
        System.out.println("Be aware ! " + obstacleNumber + " " + this.getObstacle().getName() + " lives here !");
        System.out.println("<F>ight or <R>un away from here !");
        String selectCase = input.nextLine();
        if (selectCase.equalsIgnoreCase("F") && combat(obstacleNumber)) {
            System.out.println("The fight start !");
            if (combat(obstacleNumber)) {
                System.out.println(this.getName() + "defeated all of the monsters");
                System.out.println("You gained the award ");
                this.getPlayer().claimReward(award);
                cleared = true;
                return true;
            }
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You died !");
            return false;
        }

        return true;
    }

    public boolean combat(int obstacleNumber) {
        for (int i = 1; i <= obstacleNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStatus();
            obstacleStatus(i);
            while (this.getPlayer().getHealth() > 0 & this.getObstacle().getHealth() > 0) {
                System.out.print("<F>ight or <R>un :  ");
                String selectCase = input.nextLine();
                if (selectCase.equalsIgnoreCase("F")) {

                    System.out.println("You did damage ! Great .");
                    System.out.println();
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());

                    afterHit();

                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Monster hit you ! You got damage.");
                        System.out.println();
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getPrevention();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                    }
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You defeated all of the monsters ! ");
                System.out.println("You " + this.getObstacle().getAward() + " money gained ! ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Your total money : " + this.getPlayer().getMoney());
               

            }
        }

        return false;
    }

    public void afterHit() {
        System.out.println();
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " 's health is " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStatus() {
        System.out.println("  ------- Player Information --------   ");
        System.out.println();
        System.out.println("Name : " + this.getPlayer().getName());
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Prevention :" + this.getPlayer().getInventory().getArmor().getPrevention());
        System.out.println("Damage : " + this.getPlayer().getDamage());
        System.out.println("Money : " + this.getPlayer().getMoney());

    }

    public void obstacleStatus(int i) {
        System.out.println();
        System.out.println(i + " . " + this.getObstacle().getName() + "'s  Information");
        System.out.println();
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Award : " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(this.getMaxObstacleAmount()) + 1;
    }

    public int getMaxObstacleAmount() {
        return maxObstacleAmount;
    }

    public void setMaxObstacleAmount(int maxObstacleAmount) {
        this.maxObstacleAmount = maxObstacleAmount;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }


}
