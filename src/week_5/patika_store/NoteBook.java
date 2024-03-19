package week_5.patika_store;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook extends Product {

    private static final ArrayList<String> noteBookList = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public NoteBook(int id, int price, double discount, int stock, String name, String brand, int memory, int inch, int ram) {
        super(id, price, discount, stock, name, brand, memory, inch, ram);
    }

    public void initializeNoteBookList() {
        noteBookList.add(String.valueOf(new NoteBook(1, 25000, 0.25, 50, "M1", "Apple", 512, 13, 8)));
        noteBookList.add(String.valueOf(new NoteBook(2, 20000, 0.10, 75, "MateBook", "Huawei", 512, 14, 8)));
        noteBookList.add(String.valueOf(new NoteBook(3, 20000, 0.10, 25, "Nirvana", "Casper", 512, 14, 8)));
    }


}
