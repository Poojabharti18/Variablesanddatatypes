package Variableanddata;


import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the weight:");
		double weight=sc.nextDouble();
		System.out.print("Enter the Height:");
		double height=sc.nextDouble();
		double BMI=weight/(height*height);
		System.out.println("BMI is"+BMI);
		

	}

}
