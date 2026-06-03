import java.util.Scanner;


public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int b = sc.nextInt();
        int n1=a;
        int n2=b;
        while(b>0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (n1*n2)/gcd;
        System.out.println("LCM: "+lcm);
    }
}

