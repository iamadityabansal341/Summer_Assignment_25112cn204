import java.util.Scanner;

class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String book[]= new String[3];
        int i;
        for(i=0; i< 3 ;i++){
            System.out.print("book name: ");
            book[i]= sc.nextLine();
        }
        for(i= 0; i< 3 ;i++){
            System.out.println(book[i]);
        }
    }
}