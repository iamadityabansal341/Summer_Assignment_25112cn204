import java.util.Scanner;

class q4{
    static String name[]= new String[3];
    static int marks[]= new int[3];
    static void input(){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i< 3 ;i++){
            System.out.print("student nwme: ");
            name[i]= sc.nextLine();
            System.out.print("marks: ");
            marks[i]= sc.nextInt();
            sc.nextLine();
        }
    }
    static void display(){
        for(int i=0; i< 3 ;i++){
            System.out.println("name:"+name[i]+"marks: "+marks[i]);
        }
    }
    public static void main(String[] args){
        input();
        display();
    }
}