package com.index;

import java.util.Scanner;

public class Pyramid3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int row=obj.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}


	}

}
