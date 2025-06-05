import java.util.*;
public class Operator{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUM");
        int num=obj.nextInt();
        System.out.println("ENTER THE NUM");
        int num1=obj.nextInt();

        int sum=num+num1;
        int sub=num-num1;
        int mul=num*num1;
        int div=num/num1;
        int mod=num%num1;

        System.out.println("SUM OF TWO NUMBER IS "+sum);
        System.out.println("SUBRACTION OF TWO NUMBER IS "+sub);
        System.out.println("MULTIPLICATION OF TWO NUMBER IS "+mul);
        System.out.println("DIVISION OF TWO NUMBER IS "+div);
        System.out.println("MOD OF TWO NUMBER IS "+mod);

    }
}
