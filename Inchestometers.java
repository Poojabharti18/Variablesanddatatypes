package Variableanddata;

import java.util.Scanner;

public class Inchestometers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number in inches:");
		double inch=sc.nextDouble();
		double meter =   inch* 0.0254;
		System.out.print("Converted into meter:"+meter);
		
		 
		
		

	}

}
