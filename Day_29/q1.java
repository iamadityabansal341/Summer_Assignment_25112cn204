import java.util.Scanner;

class q1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int ch,a,b;
        System.out.println("Adition");
        System.out.println("subtract");
        System.out.println("multiply");
        System.out.println("divide");
        System.out.print("Enter choice: ");
        ch = sc.nextInt();
        System.out.print("Enter 1st number: ");
        a= sc.nextInt();
        System.out.print("Enter 2ns number: ");
        b= sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Result:  "+(a+b));
                break;
            case 2:
                System.out.println("Result: "+(a-b));
                break;
            case 3:
                System.out.println("Result: "+(a*b));
                break;
            case 4:
                System.out.println("Result:"+(a/b));
                break;
            default:
                System.out.println("invalid cohice");
        }
    }
}