package com.index;
class Shape{
	public void getPerimeter() {
		
	}
	public void getarea() {
		
	}
}
class Cricle extends Shape{
public void getarea(int radius) {
	double area=3.14*radius*radius;
	System.out.println("The area of Circle is : "+area);		
	}
public void getperimeter(int radius) {
	double perimeter=2*3.14*radius;
	System.out.println("The perimeter of Circle is : "+perimeter);
	
   }
		
}
public class Shape1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricle obj=new Cricle();
		obj.getarea(5);
		obj.getperimeter(5);	

	}

}
