package Variableanddata;

import java.util.Scanner;

public class SpeedFormula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance in meters");
		float distance=sc.nextFloat();
		System.out.print("Enter the time in hours");
		float hour_time=sc.nextFloat();
		float speed=distance/ hour_time;
		System.out.print("The Speed in meter:"+speed);
		

	}

}
