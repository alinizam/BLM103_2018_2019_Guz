package Ders05Lab;

public class Ornek2b {

    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n / 2 && j <= i) {   // i = 1,2,3,4,5
                    System.out.print("* ");
                } 
                else if (i > n / 2 && j >= i) {   // i = 6,7,8,9,10
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
