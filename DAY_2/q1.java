import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int orignal_n = n;
        while(n>0){
            sumOfDigits += n % 10;
            n = n / 10;
        }
        System.out.println(" sum of digits are: "+sumOfDigits);
    }
}
