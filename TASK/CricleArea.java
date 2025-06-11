import java.util.*;
public class CircleArea{
    private int radius;
    public int getRadius(){
        return radius;
    }
    public void setrad(int radius){
        this.radius=radius;
    }
    void areadisplay(){
        double pi=3.14;
        int area=(int)pi*radius*radius;
        System.out.println("AREA OF CIRCLE IS "+area);

    }
    void perimeterdisplay(){
        double pi=3.14;
        int perimeter=(int)(2*pi*radius);
        System.out.println("PERIMETER OF CIRCLE IS "+perimeter);

    }
    public static void main(String[] args){
        CircleArea obj=new CircleArea();
        obj.setrad(5);
        obj.areadisplay();
        obj.perimeterdisplay();  
        
    }
}
