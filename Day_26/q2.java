import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >=18){
            System.out.println("Aligible");
        }
        else{
            System.out.println("Not aligible");
        }
    }
}