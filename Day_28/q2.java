import java.util.Scanner;

class q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int accNo;
        String name;
        double balance;
        System.out.print("account no: ");
        accNo= sc.nextInt();
        sc.nextLine();
        System.out.print("account holdar name: ");
        name=sc.nextLine();
        System.out.print("enter balance: ");
        balance= sc.nextDouble();
        System.out.println("account no.: "+accNo);
        System.out.println("account holder: "+name);
        System.out.println("belance: "+balance);
    }
}