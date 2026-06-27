import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;
}
public class q2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter ID: ");
        emp.id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        emp.name = sc.nextLine();
        System.out.print("Enter Salary: ");
        emp.salary= sc.nextDouble();
        System.out.println("Employee ID: "+emp.id);
        System.out.println("Employee Name: "+emp.name);
        System.out.println("Salary: "+emp.salary);
    }
}