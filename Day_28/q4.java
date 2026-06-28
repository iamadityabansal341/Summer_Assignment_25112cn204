import java.util.Scanner;

class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        String phone;
        String email;
        System.out.print("name: ");
        name= sc.nextLine();
        System.out.print("phone no,: ");
        phone= sc.nextLine();
        System.out.print("email: ");
        email= sc.nextLine();
        System.out.println("name: "+name);
        System.out.println("phone no.: "+phone);
        System.out.println("email: "+email);
    }
}