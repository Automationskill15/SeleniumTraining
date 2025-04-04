package NewPackageclass;

public class MethodTest {
    private static final String Name = null;
	public static void printNotes()
    {
    	System.out.println("print notes");
    }
    
    public static void addition (int a,int b)
    {
    	System.out.println(a+b);
    			
    }
    
    public static String getStringConcation(String str1 , String str2)
    {
    String result= str1+str2;
    return result;
    }
    public static int getTotal (int a , int b)
    {
    	int total = a+b;
    	return total;
    }
    
    public static void allDataTpes(int i ,short s1, long l,double d,float f,String s,char C)
    {
    	
    	Double x= i+f+d+C;
    	System.out.println(x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printNotes();
addition(2,3);
System.out.println(getTotal(6,5));
int d= getTotal(11,11);
System.out.println(d+2);

//String webSite= getStringConcation("Gitika","Nagar");

//System.out.println(Name + "of me");



	}

}
