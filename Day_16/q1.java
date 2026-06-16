import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 4, 5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int total = 1 + 2 + 3 + 4 + 5;
        System.out.println("Missing Number = " + (total - sum));
    }
}