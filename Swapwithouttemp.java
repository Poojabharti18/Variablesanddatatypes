package Variableanddata;

import java.util.Scanner;

public class Swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();//3
		int b=sc.nextInt();//4
		System.out.println("Before swap"+a);
		System.out.println("Before swap"+b);
		a=a+b ;//3+4=7
		b=a-b;//7-4=3;
		a=a-b;//7-3=4
		System.out.println("After swap"+a);
		System.out.println("After swap"+b);


	}

}
