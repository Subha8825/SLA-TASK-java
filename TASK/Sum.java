import java.util.*;
public class Sum{
    public static void main(String[] args){
        int a=10;
        int b=50;
        int sum=0;
        int n=b-a+1;
        if(b>a){
            sum=(n * (a+b)) / 2;
            System.out.println(sum);
        }
        else{
            System.out.println(0);
        }  

    }
}
