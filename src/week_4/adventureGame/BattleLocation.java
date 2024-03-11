package week_4.adventureGame;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacleAmount;

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacleAmount) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacleAmount = maxObstacleAmount;
    }


    @Override
    public boolean onLocation() {
        int obstacleNumber = this.randomObstacleNumber();
        System.out.println("Now you're here : " + this.getName());
        System.out.println("Be aware ! " + obstacleNumber + " " + this.getObstacle().getName() + " lives here !");
        System.out.println("<F>ight or <R>un away from here !");
        String selectCase = input.nextLine();
        if (selectCase.equalsIgnoreCase("F")) {
            System.out.println("The fight start !");
            // fighting
        }

        return true;
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
