import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter columns no. : ");
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for (int i=0;i<rows; i++) {
            for (int j =0; j <cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("RowWise Sum:");
        for (int i =0; i<rows; i++) {
            int sum = 0;
            for (int j= 0; j< cols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of Row" +(i+1)+ "=" +sum);
        }
    }
}