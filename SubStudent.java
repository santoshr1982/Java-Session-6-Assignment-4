package Com.Abstract.Class;

public class SubStudent extends Student {

	public void StudentDetails(String strStudentName , int intRoll, int intRegistratioNumber , int intMarks1 ,int intMarks2, int intMarks3)
	{
		
		System.out.println("Details of students are as follows:");
		System.out.println("Name of the student                  : " + strStudentName + "." );
		System.out.println("Roll of the student                  : " + intRoll + ".");
		System.out.println("Registration no. of the student is   : " + intRegistratioNumber + ".");
		System.out.println("Marks obtained by student in Science : " + intMarks1 + ".");
		System.out.println("Marks obtained by student in Maths   : " + intMarks2 + ".");
		System.out.println("Marks obtained by student in English : " + intMarks3 + ".");
		
	}
	
}
