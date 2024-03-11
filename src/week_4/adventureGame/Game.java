package week_4.adventureGame;

import java.util.Scanner;

public class Game {
    Player player;

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
            player.printInfo();
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Locations : \n 1-SafeHouse : You're in safe here. \n " +
                    "2-Store : You can buy your needs here. \n " +
                    "3-Cave : Be careful !  Zombie may appeal .. Award: Food \n " +
                    "4-Forest : Be careful !  Vampire may appeal .. Award: Firewood \n " +
                    "5-River :  Be careful !  Bear may appeal .. Award: Water \n " +
                    "0-Exit");
            System.out.println();
            System.out.print("Please select a location : ");

            int selectedLocation = input.nextInt();
            switch (selectedLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please enter a valid location !");
            }
            if (location == null) {
                System.out.println("You gave up too quickly . Damn it !");
                break;
            }
            if (!location.onLocation()) {
                System.out.println(" XXX GAME OVER ! XXX  ");
                break;
            }

        }


    }
}
