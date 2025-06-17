import java.util.*;
class Employee{
    public void work(){
        System.out.println("I am a developer");
    }
    public void getSalary(){
        System.out.println("35000");
    }

}
class HRManager extends Employee{
    public void work(){
        System.out.println("I am a designer");
    }
    public void addEmployee(){
        System.out.println("I am Subha");
    }

}
public class EmpInheritance{
    public static void main(String[] args){
        HRManager obj=new HRManager();
        obj.work();
        obj.getSalary();
        obj.addEmployee();
       
    }
}