package NewPackageclass;

public class Employee {
	int empID;
	String empName;
	String dept;
	String adress;
	String ComapnyName;
	String pc;
	String SSN;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}	
 public Employee()
{
	System.out.println("Provide employee details");
}
	
 public Employee(int id ,String name)
 {
	 empID = id;
	 empName = name;
	 System.out.println("I am in 2 Param constructor");
 }

public Employee(int id ,String name , String PanCard)
{
	 empID = id;
	 empName = name;
	pc= PanCard;
	
	System.out.println("I am 3 Parameter constructor");
}
}
