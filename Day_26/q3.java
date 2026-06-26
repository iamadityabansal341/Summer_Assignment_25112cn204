import java.util.Scanner;

public class q3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int balance =10000;
        System.out.println("Check Balance");
        System.out.println("Withdraw Money");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Balance: " +balance);
        }
        else if(choice ==2){
            System.out.print("Enter amount: ");
            int amount =sc.nextInt();
            if(amount<=balance){
                balance= balance-amount;
                System.out.println("withdrawal succesful");
                System.out.println("Remaining Balance: " +balance);
            }
            else{
                System.out.println("insufficient baalance");
            }
        }
        else{
            System.out.println("envalid choice");
        }
    }
}