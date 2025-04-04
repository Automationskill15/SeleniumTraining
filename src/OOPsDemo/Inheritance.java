package OOPsDemo;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOnject st = new StudentOnject();
		st.markAttendance();
		st.attendSessions();
		st.SubmitProject();
		st.lunchTime();
		
		Teacher t= new Teacher();
		t.markAttendance();
		t.deliverSession();
		t.evaluateProjects();
		t.lunchTime();
		
		Staff stff = new Staff();
		stff.markAttendance();
		stff.processSalary();
		stff.lunchTime();
		
		
		BaseClass obj= new BaseClass();
		obj.markAttendance();
		
  st.lunchTime();
  t.lunchTime();
  stff.lunchTime();
  
	}
	

}
