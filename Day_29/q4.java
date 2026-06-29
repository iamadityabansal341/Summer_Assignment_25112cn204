import java.util.Scanner;

class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int itemId,quantity;
        String itemName;
        System.out.print("enter itemId: ");
        itemId= sc.nextInt();
        sc.nextLine();
        System.out.print("enter itemName: ");
        itemName= sc.nextLine();
        System.out.print("enter quantity: ");
        quantity= sc.nextInt();
        System.out.println("itemid: "+itemId);
        System.out.println("itemMame: "+itemName);
        System.out.println("quantuty: "+quantity);
    }
}