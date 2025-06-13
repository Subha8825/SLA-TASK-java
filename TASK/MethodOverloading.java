import java.util.*;
class MethodOverloading {
    public void Print(int id,int age){
        System.out.println("Emp_id : "+" "+id +"  "+"Emp_age : "+age);

    }
    void Print(String name,String location){
        System.out.println("Emp_name : "+name+"  "+"Emp_location : "+location);

    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.Print(401,21);
        obj.Print("Subha","chennai");

        
    }
}