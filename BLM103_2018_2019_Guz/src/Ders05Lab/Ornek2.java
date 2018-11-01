package Ders05Lab;

public class Ornek2 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j && i <= n/2) {
                    System.out.print("* ");
                }
                else if (i <= j && i > n/2) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
