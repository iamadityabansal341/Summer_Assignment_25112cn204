import java.util.Scanner;

class Salary{
    String name;
    double basic;
    double bonus;
    double total;
}
public class q3{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Salary s = new Salary();
        System.out.print("Enter Name: ");
        s.name=sc.nextLine();
        System.out.print("salary: ");
        s.basic=sc.nextDouble();
        System.out.print("bonus: ");
        s.bonus=sc.nextDouble();
        s.total=s.basic+s.bonus;
        System.out.println("Employee Name: "+s.name);
        System.out.println("selary: "+s.basic);
        System.out.println("bonus: "+s.bonus);
        System.out.println("total selary: "+s.total);
    }
}