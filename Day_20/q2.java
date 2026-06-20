import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isSymmetric = true;
        System.out.print("Enter order of sq matrix: ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matriz:");
        for (int i =0; i<n; i++) {
            for (int j =0; j <n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i =0;i <n;i++) {
            for (int j =0; j<n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        if (isSymmetric) {
            System.out.println("Symmetric.");
        } else {
            System.out.println("Not Symmetric.");
        }
    }
}