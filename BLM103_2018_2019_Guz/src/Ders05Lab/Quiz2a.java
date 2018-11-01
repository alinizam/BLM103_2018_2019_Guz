package Ders05Lab;

public class Quiz2a {

    public static void main(String[] args) {

        int sayi = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1) {   // diagonal
                    System.out.print("x\t");
                } 
                else {
                    System.out.print(sayi + "\t");
                    sayi = sayi + 2;
                }
            }
            System.out.println("");
        }
    }
}
