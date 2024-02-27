package week_2;


public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris:");
        matrisiYazdir(matris1);
        matrisinTranspozunuYazdir(matris1);

        System.out.println("Matris:");
        matrisiYazdir(matris2);
        matrisinTranspozunuYazdir(matris2);
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void matrisinTranspozunuYazdir(int[][] matris) {
        System.out.println("Transpoze:");
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + "\t");
            }
            System.out.println();
        }
    }
}


