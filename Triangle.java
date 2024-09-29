package EX28_09_24;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= 2 * n + 1; ++j) {
                if (j <= n + 1 - i || j >= n + 1 + i) {
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.print("\n");
            
        }
    }
}
