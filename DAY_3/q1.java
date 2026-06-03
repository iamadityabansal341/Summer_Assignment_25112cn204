import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<1){
            isPrime = false;
        }
        else{
            for(int i=2; i<n; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("PRIME NO.");
        }
        else{
            System.out.println("NOT PRIME");
        }
    }
}
