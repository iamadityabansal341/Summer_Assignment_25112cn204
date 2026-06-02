import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = 1;
        while(n>0){
            int digit = n % 10;
            ans = ans * digit;
            n = n / 10;
        }
        System.out.println(ans);
        
    }

}
