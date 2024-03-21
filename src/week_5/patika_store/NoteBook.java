package week_5.patika_store;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook extends Product implements Operation {

    private static final ArrayList<NoteBook> notebooks = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public NoteBook(int id, int price, double discount, int stock, String name, String brand, int memory, int inch, int ram) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
    }

    public NoteBook() {
        super();
    }

    static {
        notebooks.add(new NoteBook(1, 25000, 0.25, 50, "M1", "Apple", 512, 13, 8));
        notebooks.add(new NoteBook(2, 20000, 0.10, 75, "MateBook", "Huawei", 512, 14, 8));
        notebooks.add(new NoteBook(3, 20000, 0.10, 25, "Nirvana", "Casper", 512, 14, 8));
    }

    // Override method to run the menu for notebook management
    @Override
    public void runMenu() {
        NoteBook notebookManager = new NoteBook();

        while (true) {
            System.out.println("\nNotebook Management Panel");
            System.out.println("1- List Notebooks");
            System.out.println("2- Add Notebook");
            System.out.println("3- Delete Notebook");
            System.out.println("4- Filter by ID");
            System.out.println("5- Filter by Brand");
            System.out.println("0- Main Menu");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    notebookManager.showProductList();
                    break;
                case 2:
                    notebookManager.addProduct();
                    break;
                case 3:
                    notebookManager.deleteProduct();
                    break;
                case 4:
                    notebookManager.filterByProductID();
                    break;
                case 5:
                    notebookManager.filterByProductBrand();
                    break;
                case 0:
                    System.out.println("Returning to the main menu");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }

    // Override method to display the list of notebooks
    @Override
    public void showProductList() {
        System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s  %-6s%n",
                "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM", "Stock", "Discount");

        for (NoteBook noteBook : notebooks) {
            System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s %-6s  %-6s%n",
                    noteBook.getId(), noteBook.getName(), noteBook.getPrice(), noteBook.getBrand(),
                    noteBook.getMemory(), noteBook.getInch(), noteBook.getRam(), noteBook.getStock(),
                    noteBook.getDiscount());
        }
    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductBrand() {

    }

    @Override
    public void filterByProductID() {

    }
}
