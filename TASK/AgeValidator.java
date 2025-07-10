package coll.index;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class AgeValidator {
	
	public static void Check(int age) throws InvalidAgeException{
		if(age<18 || age>45) {
			throw new InvalidAgeException("INVALID AGE:THE MUST BETWEEN 18 TO 45");
		}
		else {
			System.out.println("VALID AGE :"+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=obj.nextInt();
		try {
			Check(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception :"+e.getMessage());
		}
		

	}

}

//output

//Enter the age: 
//12
//Exception :INVALID AGE:THE MUST BETWEEN 18 TO 45

//Enter the age:
//25
//VALID AGE :25
