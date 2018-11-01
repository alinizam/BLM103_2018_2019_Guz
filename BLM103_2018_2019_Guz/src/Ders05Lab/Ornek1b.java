package Ders05Lab;

public class Ornek1b {

    public static void main(String[] args) {
        int n = 3;

        System.out.print("\t");
        for (int k = 1; k <= n; k++) {
            System.out.print(k + "\t");
        }
        System.out.println("");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");

            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }

            System.out.println("");
        }
    }
}
