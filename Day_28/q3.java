import java.util.Scanner;

class q3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int ticketNo;
        String name;
        String destination;
        System.out.print("ticket no,: ");
        ticketNo= sc.nextInt();
        sc.nextLine();
        System.out.print("paasenger name: ");
        name=sc.nextLine();
        System.out.print("destination: ");
        destination= sc.nextLine();
        System.out.println("ticket mo: "+ticketNo);
        System.out.println("passenger name: "+name);
        System.out.println("destination: "+destination);
    }
}