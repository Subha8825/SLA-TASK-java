public class ConstructorOverloading {
    private int id;
    private String name;
    private String location;
    ConstructorOverloading(int id){
        this.id=id;
    }
    ConstructorOverloading(int id,String name){
        this.id=id;
        this.name=name;
       
    }
     ConstructorOverloading(int id,String name,String location){
         this.id=id;
        this.name=name;
        this.location=location;
        
    }
    void display(){
        System.out.println("The Id  Name and Location is : "+id+"  "+name+" "+location);
    }
    
    public static void main(String[] args) {
        ConstructorOverloading obj=new ConstructorOverloading(401);
        ConstructorOverloading obj1=new ConstructorOverloading(401,"subha");
        ConstructorOverloading obj2=new ConstructorOverloading(401,"subha","chennai");
        obj.display();
        obj1.display();
        obj2.display();
        
        
    }
    
}

//OUTPUT

// The Id  Name and Location is : 401  null null
// The Id  Name and Location is : 401  subha null
// The Id  Name and Location is : 401  subha chennai