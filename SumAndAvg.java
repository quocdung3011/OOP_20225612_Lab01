package EX28_09_24;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        double avg = (double) sum / n;
        
        System.out.println("Tổng của các phần tử trong mảng là: " + sum);
        System.out.println("Trung bình của các phần tử trong mảng là: " + avg);
    }
}
