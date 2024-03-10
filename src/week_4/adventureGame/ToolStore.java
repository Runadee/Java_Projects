package week_4.adventureGame;

public class ToolStore extends NormalLocation {
    ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the tool store !");
        System.out.println("1-Weaponry");
        System.out.println("2-Armors");
        System.out.println("3-Exit");
        System.out.println();
        System.out.println("Select your needs : ");
        int selectedTool = input.nextInt();

        while (selectedTool < 1 || selectedTool > 3) {
            System.out.println("Invalid Values ! Please enter a number according to selections of tool store !");
            System.out.println("Select your needs : ");
            selectedTool = input.nextInt();
        }

        switch (selectedTool) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmors();
                break;
            case 3:
                printExit();
                break;

        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weaponry");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " Price: " + w.getPrice() + " Damage: " + w.getDamage());
        }


    }

    public void buyWeapon() {

        System.out.println("Please select a weapon : ");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
            System.out.println("Invalid Values ! Please enter again :");
            selectWeapon = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeapon);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficient funds !");
            } else {
                System.out.println(selectedWeapon.getName() + "purchased.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Your balance : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }

        }
    }

    public void printArmors() {
        System.out.println("Armors");
    }

    public void printExit() {
        System.out.println("Checked out of the store !");
    }


}
