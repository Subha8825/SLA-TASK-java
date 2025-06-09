import java.util.*;
public class NaturalNumber{
    public static void Number(int num){
        if(num>=1 && num <=10){
            System.out.println(num);
            Number(num+1);
        }
    }
    public static void main(String[] args){
        Number(1);

    }
}
