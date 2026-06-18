import java.util.Scanner;

class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter elements of first array:");
        for(int i =0; i<n1; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter elements of second array:");
        for(int i =0; i <n2; i++){
            b[i] = sc.nextInt();
        }
        int intermediate[] = new int[Math.min(n1, n2)];
        int k = 0;
        for(int i =0; i <n1; i++){
            boolean foundInB = false;
            for(int j=0; j <n2; j++){
                if(a[i] == b[j]){
                    foundInB = true;
                    break;
                }
            }
            if(foundInB){
                boolean alreadyPresent = false;
                for(int j=0; j <k; j++){
                    if(intermediate[j] == a[i]){
                        alreadyPresent = true;
                        break;
                    }
                }
                if(!alreadyPresent){
                    intermediate[k++] = a[i];
                }
            }
        }
        System.out.println("Intersection of Arrays:");
        for(int i = 0; i < k; i++){
            System.out.print(intermediate[i] + " ");
        }
    }
}