
import java.util.*;
class Maxnum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the arr size :");
        int n=obj.nextInt();
        System.out.println("Enter the arr elements :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        
       
        
            
    }
}

// Enter the arr size :
// 4
// Enter the arr elements :
// 8 9 6 5


//output
// 9

