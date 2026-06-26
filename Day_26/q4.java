import java.util.Scanner;

public class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score =0;
        System.out.println("capital of India:");
        System.out.print("Answer:");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("Delhi")){
            score++;
        }
        System.out.println("2+2:");
        int num = sc.nextInt();
        if(num ==4){
            score++;
        }
        System.out.println("Your Score:"+score+"/2");
    }
}