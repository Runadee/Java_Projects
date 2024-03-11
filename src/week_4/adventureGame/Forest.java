package week_4.adventureGame;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3);
    }
}
