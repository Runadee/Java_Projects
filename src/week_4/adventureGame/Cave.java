package week_4.adventureGame;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 7);
    }
}
