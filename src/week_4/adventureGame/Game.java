package week_4.adventureGame;

import java.util.Scanner;

public class Game {
    Player player;
    //Location location;

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Adventure Game ! ");
        System.out.print("Please enter a  name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hello , " + player.getName() + "." + " Welcome to this dark and foggy island ! ");
        System.out.println("Please select a character to start the game ! ");
        player.selectCharacter();


    }
}
