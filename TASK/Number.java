import java.util.*;
class Number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         System.out.println("ENTER THE NUM");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int num=a%100;
        int num1=b%100;
        if(num==num1){
          System.out.println("Same Number");   
        }
        else{
        System.out.println("Not a same num");
        }
    }
}