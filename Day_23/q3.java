import java.util.Scanner;

public class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2ns string: ");
        String str2 = sc.nextLine();
        if (str1.length() !=str2.length()){
            System.out.println("Not anagram");
            return;
        }
        int[] freq =new int[256];
        for (int i =0; i<str1.length(); i++){
            freq[str1.charAt(i)]++;
        }
        for (int i=0;i<str2.length(); i++){
            freq[str2.charAt(i)]--;
        }
        for (int i=0; i<256; i++){
            if (freq[i] != 0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("yes anagrams");
    }
}