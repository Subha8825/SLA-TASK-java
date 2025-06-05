import java.util.*;
public class Circle{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        double radius=obj.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;
        System.out.println("AREA OF CIRCLE IS "+area);
        System.out.println("PERIMETER OF CIRCLE IS "+perimeter);
    }
}
