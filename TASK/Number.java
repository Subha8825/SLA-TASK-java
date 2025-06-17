package com.index;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2468;
		int temp=num;
		String res="";
		while(temp>0) {
			int n=temp%10;
			if(n==2) {
				res="Two "+res;
			}
			else if(n==4) {
				res="Four "+res;
			}
			else if(n==6) {
				res="Six "+res;
				
			}
			else if(n==8) {
				res="Eight "+res;
			}
			temp/=10;
		}
		System.out.println(res);
	}

}
