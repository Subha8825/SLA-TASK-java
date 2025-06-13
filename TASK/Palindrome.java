import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUM");
        int num=obj.nextInt();
        int temp=num;
        int res=0;
        while(temp>0){
            int s=temp%10;
            res=res*10+s;
            temp/=10;
        }
        if(res==num){
            System.out.println("The num is Palindrome");
        }
        else{
            System.out.println("The num is not a Palindrome");
        }
        
    }
}