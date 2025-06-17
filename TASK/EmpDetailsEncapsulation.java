import java.util.*;
public class EmpDetailsEncapsulation{
    private int emp_id;
    private String emp_name;
    private String emp_location;

    public int getId(){
        return emp_id;
    }
    public void setId(int emp_id){
        this.emp_id=emp_id;
    }
     public String getName(){
        return emp_name;
    }
    public void setName(String emp_name){
        this.emp_name=emp_name;
    }
     public String getLocation(){
        return emp_location;
    }
    public void setLocation(String emp_location){
        this.emp_location=emp_location;
    }
    public static void main(String[] args){
        EmpDetailsEncapsulation obj= new EmpDetailsEncapsulation();
        System.out.println("Employees Details");
        obj.setId(4050);
        System.out.println(obj.getId());
        obj.setName("Subha");
        System.out.println(obj.getName());
        obj.setLocation("chennai");
        System.out.println(obj.getLocation());      
    }
}
