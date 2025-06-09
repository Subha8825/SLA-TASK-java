import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num=obj.nextInt();
        int n=num;
        int y=0;
        while(n>0){
            int s=n%10;
            y=y*10+s;
            n/=10;
        }
        System.out.println("The reverse num is "+y);
        
      
       
    }
}
