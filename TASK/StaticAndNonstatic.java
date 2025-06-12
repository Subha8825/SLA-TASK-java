import java.util.*;
public class StaticAndNonstatic{
    static int a=10;
    static int b=20;
    int c=30;
    static void add(){
        System.out.println("The addition of a and b is : " + (a+b));
    }
    static void multiply(){
        System.out.println("The multiply of a and b is : "+ a*b);
    }
    void divide(){
        int d=b-a;
        System.out.println("The divide is : " + c/d);
    }
    public static void main(String[] args) {
        add();
        multiply();
        StaticAndNonstatic obj=new StaticAndNonstatic();
        obj.divide();
    
  }

}

//output

// The addition of a and b is : 30
// The multiply of a and b is : 200
// The divide is : 3
