import java.util.Scanner;

public class q3{
    static void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a+ " " +b+ " ");
        for (int i= 3; i<=n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}