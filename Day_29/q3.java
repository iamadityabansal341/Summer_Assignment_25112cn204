import java.util.Scanner;

class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int ch;
        System.out.print("enter string: ");
        str= sc.nextLine();
        System.out.println("display in Uppercase");
        System.out.println("find Length");
        System.out.print("enter choice: ");
        ch= sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("upercase: "+str.toUpperCase());
                break;
            case 2:
                System.out.println("length: "+str.length());
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}