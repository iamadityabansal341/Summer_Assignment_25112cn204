import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1=sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 =sc.nextLine();
        System.out.print("Common ch: ");
        for(int i = 0;i <str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch)!= -1){
                System.out.print(ch+" ");
            }
        }
    }
}