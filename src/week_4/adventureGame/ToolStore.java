package week_4.adventureGame;

public class ToolStore extends NormalLocation {
    ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the tool store !");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1-Weaponry");
            System.out.println("2-Armors");
            System.out.println("3-Exit");
            System.out.println();
            System.out.print("Select your needs : ");
            int selectedTool = input.nextInt();

            while (selectedTool < 1 || selectedTool > 3) {
                System.out.println("Invalid Values ! Please enter a number according to selections of tool store !");
                System.out.print("Select your needs : ");
                selectedTool = input.nextInt();
            }

            switch (selectedTool) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    printExit();
                    showMenu = false;
                    break;

            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weaponry");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " Price: " + w.getPrice() + " Damage: " + w.getDamage());
        }
        System.out.println("0 - Exit");

    }

    public void buyWeapon() {

        System.out.print("Please select a weapon : ");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length) {
            System.out.print("Invalid Values ! Please enter again :");
            selectWeapon = input.nextInt();
        }
        if (selectWeapon != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeapon);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Insufficient funds !");
                } else {
                    System.out.println(selectedWeapon.getName() + " purchased.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }

            }
        }

    }

    public void printArmors() {
        System.out.println("Armors");
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + "-" + armor.getName() + " Price: " +
                    armor.getPrice() + " Prevention: " +
                    armor.getPrevention());
        }
        System.out.println("0 - Exit");
    }

    public void buyArmor() {
        System.out.print("Please select an Armor : ");
        int selectArmor = input.nextInt();
        while (selectArmor < 0 || selectArmor > Armor.armors().length) {
            System.out.print("Invalid Values ! Please enter again : ");
            selectArmor = input.nextInt();
        }
        if (selectArmor != 0) {
            Armor selectedArmor = Armor.getArmorObjectByID(selectArmor);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Insufficient funds !");
                } else {
                    System.out.println(selectedArmor.getName() + " purchased.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);

                }
            }
        }

    }

    public void printExit() {
        System.out.println("Checked out of the store !");
    }


}
