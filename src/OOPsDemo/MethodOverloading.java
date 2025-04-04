package OOPsDemo;

public class MethodOverloading {
//
	public void add (int a, int b)
	{
		System.out.println("adding two integer numbers");
	}
	
	public void add (int a, int b,int c )
	{
		System.out.println("adding 3 integer numbers");
	}
	
	public void add ()
	{
		System.out.println("adding no integer numbers");
	}
	
	public void add (float a, float b)
	{
		System.out.println("adding two float numbers");
	}
}
