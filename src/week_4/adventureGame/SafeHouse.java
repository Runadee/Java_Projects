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

        return true;


    }


}
