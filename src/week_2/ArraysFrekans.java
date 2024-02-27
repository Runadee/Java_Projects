package week_2;

public class ArraysFrekans {


    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = dizi.length;
        boolean[] ziyaretEdildi = new boolean[n];


        for (int i = 0; i < n; i++) {

            if (ziyaretEdildi[i])
                continue;


            int frekans = 1;
            for (int j = i + 1; j < n; j++) {
                if (dizi[i] == dizi[j]) {
                    frekans++;
                    ziyaretEdildi[j] = true;
                }
            }

            System.out.println(dizi[i] + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}


