import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int orignal_n = n;
        int reverse = 0;
        while(n>0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if(orignal_n == reverse){
            System.out.println("YES,Pallindrome");
        }
        else{
            System.out.println("NOT, Pallindrome");
        }
    }

}
