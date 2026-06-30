import java.util.Scanner;

class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name[]= new String[3];
        int salary[]= new int[3];
        int i;
        for(i=0; i< 3 ;i++){
            System.out.print("employe name: ");
            name[i]= sc.nextLine();

            System.out.print("salary: ");
            salary[i]= sc.nextInt();
            sc.nextLine();
        }
        for(i=0; i< 3 ;i++){
            System.out.println("name: "+name[i]+"salary: "+salary[i]);
        }
    }
}