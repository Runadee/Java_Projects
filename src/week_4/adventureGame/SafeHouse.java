package week_4.adventureGame;

import java.util.List;

public class SafeHouse extends NormalLocation {

    SafeHouse(Player player) {
        super(player, "Safety House");
    }


    @Override
    public boolean onLocation() {
        System.out.println("You're at the Safety House !");
        System.out.println("Your health is renewed !");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());

        if (checkAllRewards()) {
            System.out.println("Congratulations! You have collected all rewards.");
            System.out.println("You won the game!");
            return true;
        } else {
            System.out.println("You need to collect all rewards before winning the game.");
            return false;
        }


    }


    private boolean checkAllRewards() {
        List<String> items = getPlayer().getInventory().getItems();
        return items.contains("Food") && items.contains("Firewood") && items.contains("Water");
    }
}
