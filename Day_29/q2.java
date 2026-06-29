import java.util.Scanner;

class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        int i,ch,sum= 0;
        System.out.println("Enter 5 elements:");
        for(i= 0; i< 5 ;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("display Array");
        System.out.println("ffind Sum");
        System.out.print("Enter choice: ");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("array element:");
                for(i= 0; i< 5 ;i++){
                    System.out.print(a[i]+ " ");
                }
                break;
            case 2:
                for(i= 0; i< 5;i++){
                    sum=sum+a[i];
                }
                System.out.println("Sum: "+sum);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}