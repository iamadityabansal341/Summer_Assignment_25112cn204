import java.util.Scanner;

class q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1=sc.nextInt();
        int a[]= new int[n1];
        System.out.println("Enter elements of first array:");
        for(int i =0;i <n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2= sc.nextInt();
        int b[]=new int[n2];
        System.out.println("Enter elements of second array:");
        for(int i =0;i< n2;i++){
            b[i] = sc.nextInt();
        }
        int c[]= new int[Math.min(n1,n2)];
        int k= 0;
        for(int i= 0;i< n1;i++){
            for(int j = 0;j <n2;j++){
                if(a[i]==b[j]){
                    boolean already=false;
                    for(int x=0;x< k; x++){
                        if(c[x]==a[i]){
                            already=true;
                            break;
                        }
                    }
                    if(!already){
                        c[k++]=a[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Common Elements:");
        for(int i=0;i<k;i++){
            System.out.print(c[i]+" ");
        }
    }
}