
public class student {//blueprint of student as an object is ready

	public static void main(String[] args) {
	student st1 = new student();
	st1.studentID = 1;
	st1.StudentName= "Gitika";
	st1.Grade = 1;
	st1.division = 1;
	st1.mobileNo= 12345;
	st1.UniversityName = "RGPV";
	st1.address = "NewJersey";

	System.out.println(st1.studentID);
	System.out.println(st1.StudentName);
	System.out.println(st1.Grade);
	System.out.println(st1.division);
	System.out.println(st1.mobileNo);
	System.out.println(st1.UniversityName);
	System.out.println(st1.address);
	}
//attributes
int studentID;
String StudentName;
int Grade;
char division;
long mobileNo;
String UniversityName;
String address;

//behavior
public void attenedLectures()
{
	System.out.println("students attend lecture");
}
public void lecture()

{
	System.out.println("students attend lecture");
}

public void exam()
{
	System.out.println("student give exam");
}

	}


