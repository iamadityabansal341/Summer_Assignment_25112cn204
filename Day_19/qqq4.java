import java.util.Scanner;

public class qqq4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, primarySum = 0, secondarySum = 0;
        System.out.print("Enter order matrix: ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter element of matriz:");
        for (int i=0; i<n; i++) {
            for (int j =0; j <n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i <n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n-1-i];
        }
        System.out.println("Primary Diagonal Sum = " +primarySum);
        System.out.println("Secondary Diagonal Sum = " +secondarySum);
        System.out.println("Total Diagonal Sum = " +(primarySum+secondarySum));
    }
}