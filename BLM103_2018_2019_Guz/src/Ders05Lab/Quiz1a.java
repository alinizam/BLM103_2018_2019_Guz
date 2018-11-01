package Ders05Lab;

public class Quiz1a {

    public static void main(String[] args) {
        int sayi = 35;
        int sayac = 0;

        while (sayi > 0) {
            int birler = sayi % 10;

            if (birler % 3 == 0) {
                sayac++;
            }

            sayi = sayi / 10;
        }

        System.out.println("sonuc : " + sayac);
    }
}
