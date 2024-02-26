package week_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AsalSayılar {
    public static void main(String[] args) {

        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }
    }
}