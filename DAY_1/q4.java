import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int numOfDigits = 0;
        int orignal_n = n;
        while(n>0){
            n = n / 10;
            numOfDigits++;
        }
        System.out.println(" number of digits are: "+numOfDigits);
    }
}
