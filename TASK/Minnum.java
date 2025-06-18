
import java.util.*;
class Minnum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the arr size :");
        int n=obj.nextInt();
        System.out.println("Enter the arr elements :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println( "The min num is : " +min);   
            
    }
}


// Enter the arr size :
// 5
// Enter the arr elements :
// 3 4 6 1 9

//output
// The min num is : 1