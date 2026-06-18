import java.util.Scanner;

class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter elements of 1st array:");
        for(int i=0; i<n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of 2nd array: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter elements of 2nf array:");
        for(int i =0; i <n2; i++){
            b[i] = sc.nextInt();
        }
        int union[] = new int[n1+n2];
        int k = 0;
        for(int i =0; i <n1; i++){
            boolean found = false;
            for(int j =0; j <k; j++){
                if(a[i] == union[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                union[k++] = a[i];
            }
        }
        for(int i = 0; i < n2; i++){
            boolean found = false;
            for(int j = 0; j < k; j++){
                if(b[i] == union[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                union[k++] = b[i];
            }
        }
        System.out.println("Union of Arrays:");
        for(int i = 0; i < k; i++){
            System.out.print(union[i] + " ");
        }
    }
}