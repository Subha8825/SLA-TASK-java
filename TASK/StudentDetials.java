import java.util.*;
public class StudentDetials{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE STUDENT NAME");
        String name=obj.next();
        System.out.println("ENTER THE STUDENT ROLLNUMBER");
        String roll=obj.next();
        System.out.println("ENTER THE STUDENT MARKS");
        double tamil=obj.nextDouble();
        double english=obj.nextDouble();
        double maths=obj.nextDouble();
        double science=obj.nextDouble();
        double social=obj.nextDouble();
        double add=tamil+english+maths+science+social;
        double avg=add/5;
        System.out.println("TOTAL MARK OF STUDENT  "+add);
        System.out.println("AVERAGE MARK OF STUDENT IS "+avg);
    }
}