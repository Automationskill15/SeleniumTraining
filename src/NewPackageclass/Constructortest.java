package NewPackageclass;

public class Constructortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("I am in main method");
Employee e = new Employee();
System.out.println(e.empID);
System.out.println(e.empName);

Employee e1 = new Employee(1,"Gitika");

System.out.println(e1.empID);
System.out.println(e1.empName);

Employee e2 = new Employee(2,"Guru","abc");


System.out.println(e2.empID);
System.out.println(e2.empName);
System.out.println(e2.pc);
System.out.println("constructor 3");

	}

}
