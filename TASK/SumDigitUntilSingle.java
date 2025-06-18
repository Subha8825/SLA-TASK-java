package com.index;
import java.util.*;
public class SumDigitUntilSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=obj.nextInt();
		int temp=num;
		int sum=0;
		while(temp>=10) {
			while(temp>0) {
			int dig=temp%10;
			sum+=dig;
			temp/=10;
		}
		temp=sum;
		sum=0;
		}
		System.out.println("Sum of digit untill single number : "+ temp);
		

	}
	

}

//Output
//Enter the Number:
//555
//Sum of digit untill single number : 6

//5+5+5=15
//1+5=6
