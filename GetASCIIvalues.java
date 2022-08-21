package Variableanddata;

import java.util.Scanner;

public class GetASCIIvalues {
	
	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Enter a Character");
			 char ch=sc.next().charAt(0);
			
		     int ascii=(int)ch;
			System.out.println("The ASCII value of character: "+ch +ascii);
			
    }
}
