
import java.util.*;
class ConcatArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the arr1 size :");
        int n1=obj.nextInt();
        System.out.println("Enter the arr1 elements :");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=obj.nextInt();
        }
        System.out.println("Enter the arr2 size :");
        int n2=obj.nextInt();
        System.out.println("Enter the arr2 elements :");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=obj.nextInt();
        }
        int n=n1+n2;
        int concat[]=new int[n];
        for(int i=0;i<n1;i++){
            concat[i]=arr1[i];
        }
        for(int i=n1;i<n;i++){
            int c=i-n1;
            concat[i]=arr2[c];
        }
        
        for(int k:concat){
            System.out.println(k);
        }
            
    }
}


// Enter the arr1 size :
// 3
// Enter the arr1 elements :
// 1 2 3
// Enter the arr2 size :
// 3
// Enter the arr2 elements :
// 4 5 6

//output
// 1
// 2
// 3
// 4
// 5
// 6