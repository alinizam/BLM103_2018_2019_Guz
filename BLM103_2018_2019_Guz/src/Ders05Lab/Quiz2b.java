package Ders05Lab;

public class Quiz2b {

    public static void main(String[] args) {
        int n = 7;
        int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n + 1 == j + i) {
                    System.out.print("x\t");
                } 
                else if (i == j) {
                    System.out.print("y\t");
                } 
                else {
                    System.out.print(k + "\t");
                    k = k + 2;
                }
            }
            System.out.println("");
        }
    }
}
