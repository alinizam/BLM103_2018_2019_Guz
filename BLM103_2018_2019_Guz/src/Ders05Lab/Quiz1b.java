package Ders05Lab;

public class Quiz1b {

    public static void main(String[] args) {
        int sayi = 369853;
        int sayac = 0;

        for (; sayi > 0;) {
            int birler = sayi % 10;
            sayi = sayi / 10;

            if (birler % 3 == 0) {
                sayac++;
            }
        }

        System.out.println("sonuc : " + sayac);
    }
}
