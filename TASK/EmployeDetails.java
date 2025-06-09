import java.util.*;
public class StudentDetails{
    int emp_id;
    String emp_name;
    String emp_location;
    String emp_dest;
    public StudentDetails(int id,String name,String location,String dest){
        emp_id=id;
        emp_name=name;
        emp_location=location;
        emp_dest=dest;
    }
    void display(){
        System.out.println(emp_id+"   "+emp_name+"   "+emp_location+"   "+emp_dest);
    }
    public static void main(String[] args){
        System.out.println("ID   NAME   LOCATION   DESTINATIO");
        System.out.println("---------------------------------");
        StudentDetails obj=new StudentDetails(1,"Subha","chennai","designer");
        StudentDetails obj1=new StudentDetails(2,"Sharmi","Delhi","developer");
        StudentDetails obj2=new StudentDetails(3,"Abarna","kochi","tester");
        StudentDetails obj3=new StudentDetails(4,"Sabari","jammu","designer");
        StudentDetails obj4=new StudentDetails(5,"Tamil","kochi","developer");
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();     
    }
}