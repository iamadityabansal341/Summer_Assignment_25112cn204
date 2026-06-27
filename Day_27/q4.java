import java.util.Scanner;

class Marksheet{
    String name;
    int roll;
    int m1,m2,m3;
    int total;
    double percentage;
}
public class q4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Marksheet m =  new Marksheet();
        System.out.print("Enter Name: ");
        m.name=sc.nextLine();
        System.out.print("roll No: ");
        m.roll=sc.nextInt();
        System.out.print("subject1: ");
        m.m1=sc.nextInt();
        System.out.print("subject2: ");
        m.m2=sc.nextInt();
        System.out.print("subject3: ");
        m.m3=sc.nextInt();
        m.total=m.m1+m.m2+m.m3;
        m.percentage=m.total/3.0;
        System.out.println("Name: "+m.name);
        System.out.println("toll No: "+m.roll);
        System.out.println("subject 1: "+m.m1);
        System.out.println("subject 2: "+m.m2);
        System.out.println("subject 3: "+m.m3);
        System.out.println("total: "+m.total);
        System.out.println("ppercentage: "+m.percentage);
        if(m.percentage>=40){
            System.out.println("Result :passs");
        }else{
            System.out.println("Result: fail");
        }
    }
}