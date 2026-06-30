import java.util.Scanner;

class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name[]= new String[3];
        int marks[]= new int[3];
        int i;
        for(i=0; i<3 ;i++){
            System.out.print("student name: ");
            name[i]= sc.nextLine();
            System.out.print("enter narks: ");
            marks[i]= sc.nextInt();
            sc.nextLine();
        }
        for(i=0; i< 3 ;i++){
            System.out.println("name: "+name[i]+" Marks:"+marks[i]);
        }
    }
}