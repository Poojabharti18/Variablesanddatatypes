package Variableanddata;

import java.util.Scanner;

public class UsingArthemeticOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the input 1");
		int a=sc.nextInt();
		System.out.print("enter the input 2");
		int b=sc.nextInt();
		int Addition=a+b;
		int Subtraction=a-b;
		int Division=a/b;
		int Multiplication=a*b;
		int Modulo=a%b;
		System.out.println("Addition of Two Input is:"+Addition);
		System.out.println("subtraction of Two Input is:"+Subtraction);
		System.out.println("Division of Two Input is:"+Division);
		System.out.println("Multiplication of Two Input is:"+Multiplication);
		System.out.println("Modulo of Two Input is:"+Modulo);
		
		

	}

}
