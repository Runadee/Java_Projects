package week_4.adventureGame;

import java.util.Scanner;

public class Game {
    Player player;
    //Location location;

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println();
        System.out.println("Welcome to the Adventure Game ! ");
        System.out.println();
        System.out.print("Please enter a  name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hello , " + player.getName() + "." + " Welcome to this dark and foggy island ! ");
        System.out.println();
        System.out.println("Please select a character to start the game ! ");
        player.selectCharacter();

        Location location = null;
        while (true) {
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Locations : \n 1-SafeHouse \n 2-Store");
            System.out.println();
            System.out.print("Please select a location : ");

            int selectedLocation = input.nextInt();
            switch (selectedLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation()) {
                System.out.println(" XXX GAME OVER ! XXX  ");
                break;
            }

        }


    }
}
