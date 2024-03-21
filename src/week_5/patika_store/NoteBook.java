package week_5.patika_store;

import java.util.ArrayList;
import java.util.Scanner;

// Notebook class extending Product and implementing Operation interface
public class NoteBook extends Product implements Operation {

    private static final ArrayList<NoteBook> notebooks = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    // Parameterized constructor to initialize notebook properties
    public NoteBook(int id, int price, double discount, int stock, String name, String brand, int memory, double inch, int ram) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
    }

    // Default constructor
    public NoteBook() {
        super();
    }

    static {
        notebooks.add(new NoteBook(1, 25000, 0.25, 50, "M1", "Apple", 512, 13.0, 8));
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
        System.out.println("Please enter a new ID:");
        int newNotebookID = input.nextInt();
        input.nextLine();

        if (findNotebookByID(newNotebookID) == null) {
            System.out.println("Please enter the product name : ");
            String newNotebookName = input.nextLine();

            System.out.println("Please enter the brand:");
            String newNotebookBrand = input.nextLine();

            System.out.println("Please enter the price:");
            int newNotebookPrice = input.nextInt();

            System.out.println("Please enter the discount rate:");
            double newNotebookDiscount = input.nextDouble();

            System.out.println("Please enter the stock information:");
            int newNotebookStock = input.nextInt();

            System.out.println("Please enter the storage size:");
            int newNotebookMemory = input.nextInt();

            System.out.println("Please enter the screen size:");
            double newNotebookScreenSize = input.nextDouble();

            System.out.println("Please enter the RAM (in GB):");
            int newNotebookRam = input.nextInt();

            notebooks.add(new NoteBook(newNotebookID, newNotebookPrice, newNotebookDiscount, newNotebookStock,
                    newNotebookName, newNotebookBrand, newNotebookMemory, newNotebookScreenSize, newNotebookRam));


        } else {
            System.out.println("This product has already been added. Please try again.");
        }

    }

    // Method to find a notebook by its ID
    private NoteBook findNotebookByID(int id) {
        for (NoteBook noteBook : notebooks) {
            if (noteBook.getId() == id) {
                return noteBook;
            }
        }
        return null;
    }

    // Override method to delete a notebook from the list
    @Override
    public void deleteProduct() {
        System.out.println("Enter the ID of the product you want to delete:");
        int deleteSelection = input.nextInt();

        NoteBook notebookToDelete = findNotebookByID(deleteSelection);

        if (notebookToDelete != null) {
            notebooks.remove(notebookToDelete);
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product ID not found . Please try again.");
        }


    }

    // Override method to filter notebooks by brand
    @Override
    public void filterByProductBrand() {
        System.out.println("Enter the brand name to filter:");
        String filterBrand = input.nextLine();

        System.out.println("Filter Results");
        for (NoteBook noteBook : notebooks) {
            if (noteBook.getBrand().equalsIgnoreCase(filterBrand)) {
                System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s%n",
                        noteBook.getId(), noteBook.getName(), noteBook.getPrice(), noteBook.getBrand(),
                        noteBook.getMemory(), noteBook.getInch(), noteBook.getRam());
            }
        }

    }

    // Override method to filter notebooks by ID
    @Override
    public void filterByProductID() {
        System.out.println("Enter the ID to filter:");
        int selectedProductId = input.nextInt();

        System.out.println("Filter Results ");
        for (NoteBook noteBook : notebooks) {
            if (noteBook.getId() == selectedProductId) {
                System.out.printf("%-8s %-22s %-12s %-16s %-10s %-6s %-6s%n",
                        noteBook.getId(), noteBook.getName(), noteBook.getPrice(), noteBook.getBrand(),
                        noteBook.getMemory(), noteBook.getInch(), noteBook.getRam());
            }
        }
    }


}
