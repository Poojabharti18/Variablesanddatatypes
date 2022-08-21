package Variableanddata;

public class StudentMarks {

	public static void main(String[] args) {
		int stdid=10001;
		String sname="Pooja";
		int Hindi_marks=90;
		int Math_marks=89;
		int English_marks=78;
		int Science_marks=88;
		int SocialScience_marks=87;
		int Total_Maximum=500;
		int Total_marks=(Hindi_marks+Math_marks+English_marks+Science_marks+SocialScience_marks);
		float Percentage=Total_marks*100/Total_Maximum;
		System.out.println("Student Id:"+stdid);
		System.out.println("Student Name:"+sname);
		System.out.println("Hindi Marks :"+Hindi_marks);
		System.out.println("Math Marks:"+Math_marks);
		System.out.println("English_marks:"+English_marks);
		System.out.println("Science_marks:"+Science_marks);
		System.out.println("Total_marks:"+Total_marks);
		System.out.println("Percentage:"+Percentage);

	}

}
