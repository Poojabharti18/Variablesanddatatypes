package Variableanddata;
import java.util.Scanner;


public class StringToCharToAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String Name=sc.next();
		char a[]=Name.toCharArray();
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println((byte)a[0]+a[1]+a[2]+a[3]);


	}

}
