import java.util.Scanner;

public class q1 {
    static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println("Sum:  " + result);
    }
}