import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=10;i++){
            ans = n * i;
            System.out.println(ans);
        }
    }
}
