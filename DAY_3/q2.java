import java.util.Scanner;

public class q2 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number of the range: ");
        int n1 = sc.nextInt();
        System.out.println("Enter last number of the range: ");
        int n2 = sc.nextInt();
        for(int n=n1; n<n2; n++){
            if(n<=1){
                continue;
            }
            boolean isPrime = true;
            for(int j=2; j<n; j++){
                if(n % j == 0){
                    isPrime = false;
                    break; ////////
                }
            }
            if(isPrime){
                System.out.println(n +" ");
            }
        }
    }

}
