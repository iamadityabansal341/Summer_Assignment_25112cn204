import java.util.Scanner;

public class q2{
    static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Maximum = " +max(a, b));
    }
}