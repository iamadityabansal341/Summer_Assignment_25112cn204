import java.util.Scanner;

class Student{
    int roll;
    String name;
    int marks;
}
public class q1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter roll no: ");
        s.roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        s.name =sc.nextLine();
        System.out.print("Enter Marks: ");
        s.marks =sc.nextInt();
        System.out.println("Roll No: "+s.roll);
        System.out.println("Name: "+s.name);
        System.out.println("Marks: "+s.marks);
        sc.close();
    }
}