package Week_1;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteTipi = 15;
        short shortTipi = byteTipi;
        System.out.println("byte dan short tipine otomatik tip dönüşümü sonucu : " + shortTipi);

        int intTipi = shortTipi;
        System.out.println("short dan int tipine otomatik tip dönüşümü sonucu : " + intTipi);

        long longTipi = intTipi;
        System.out.println("int den long tipine otomatik tip dönüşümü sonucu : " + longTipi);

        float floatTipi = longTipi;
        System.out.println("long dan float tipine otomatik tip dönüşümü sonucu : " + floatTipi);

        double doubleTipi = floatTipi;
        System.out.println("float dan double tipine otomatik tip dönüşümü sonucu : " + doubleTipi);

        double doubleVeri = 12723.12;
        float doubleToFloat = (float) doubleVeri;
        System.out.println("double veri türünden float Veri Türüne Casting :"+doubleToFloat);

        long longVeri = 32654;
        int longToInt = (int) longVeri;
        System.out.println("long veri türünden int Veri Türüne Casting :"+longToInt);

        int intVeri = 4587;
        short intToShort = (short) intVeri;
        System.out.println("int veri türünden short Veri Türüne Casting :"+intToShort);

        short shortVeri = 127;
        byte shortToByte = (byte) shortVeri;
        System.out.println("short veri türünden byte Veri Türüne Casting :"+shortToByte);


    }
}