package week_2.boxingGame;

public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Jack", 70, 15, 150, 30);
        Fighter fighter2 = new Fighter("John", 80, 10, 135, 25);

        Match match = new Match(fighter1, fighter2, 100, 200);
        match.run();

    }
}
