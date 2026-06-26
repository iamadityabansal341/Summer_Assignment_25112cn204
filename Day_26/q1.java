import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number =7;
        int guess;
        do{
            System.out.print("guess anyy numbe(1-10): ");
            guess = sc.nextInt();
            if(guess >number){
                System.out.println("High");
            }
            else if(guess<number){
                System.out.println("low");
            }
        }while(guess!=number);
        System.out.println("Correct gues");
    }
}