package week_4.adventureGame;

public class SafeHouse extends NormalLocation {

    SafeHouse(Player player) {
        super(player, "Safety House");
    }


    @Override
    public boolean onLocation() {
        System.out.println("You're at the Safety House !");
        System.out.println("Your health is renewed !");
        return true;
    }
}
