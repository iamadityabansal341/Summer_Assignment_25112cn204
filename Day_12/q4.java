import java.util.Scanner;

public class q4{
    static boolean isPerfect(int num) {
        int sum =0;
        for (int i =1; i< num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        if (isPerfect(num))
            System.out.println("Perfect no.");
        else
            System.out.println("Not a Perfect no.");
    }
}