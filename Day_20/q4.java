import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter no. rows: ");
        rows = sc.nextInt();
        System.out.print("Enter mo. of columns: ");
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for (int i =0;i<rows; i++) {
            for (int j =0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Column-wise Sum:");
        for (int j= 0; j <cols; j++) {
            int sum =0;
            for (int i =0; i <rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column sum"+(j+1)+"="+sum);
        }
    }
}