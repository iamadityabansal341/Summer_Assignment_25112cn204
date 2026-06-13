import java.util.Scanner;

public class q2{
    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        if (isArmstrong(num))
            System.out.println("Armstrong No.");
        else
            System.out.println("Not an Armstrong");

    }
}