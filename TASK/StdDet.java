package program;
class Student12{
	int id;
	String name;
	String location;
	String branch;
	String degree;
	Student12(int id,String name,String location,String branch,String degree){
		this.id=id;
		this.name=name;
		this.location=location;
		this.branch=branch;
		this.degree=degree;
		
	}
	void display() {
		if(id>=3 && location.equals("south") && branch.equals("Engineering")) {
			System.out.println("The student details : "+ id+" "+name+" "+location+" "+branch+" "+degree);
		}
		
	}	
	
}
public class StdDet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student12 obj[]=new Student12[5];
		
		obj[0]=new Student12(4,"Subha","south","Engineering","CSE");
		obj[1]=new Student12(1,"Sabari","south","arts","English");
		obj[2]=new Student12(2,"Sharmi","south","arts","tamil");
		obj[3]=new Student12(3,"js","south","Engineering","IT");
		obj[4]=new Student12(5,"abarna","south","Engineering","CSE");
		
		
		for(int i=0;i<obj.length;i++) {
			obj[i].display();
		}

	}

}
