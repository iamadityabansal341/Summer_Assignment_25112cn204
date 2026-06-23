import java.util.Scanner;

public class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }
        char maxChar = str.charAt(0);
        int max = freq[str.charAt(0)];
        for (int i =1; i<str.length(); i++){
            if (freq[str.charAt(i)] >max){
                max =freq[str.charAt(i)];
                maxChar= str.charAt(i);
            }
        }
        System.out.println("Maximum occurring ch: " +maxChar);
        System.out.println("Frequency: " +max);
        sc.close();
    }
}