package Basicstring;

public class stringDemo {

	/* String
	 * --it is class
	 * --it is non primitive data type
	 * --sequence of character
	 * 
	 * 2 ways to define string
	 * 1)string literal
	 * 2)new keyword
	 * 
	 * Rule 
	 * --Strings objects are imutable in nature
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string name;//declaration of the variable
 String name = " Gitika";
 System.out.println("Gitika"); //Assignment of variable
 
 String n = new String ("Hello");
 System.out.println(n);
 
 String msg = "have a good day ";
 System.out.println(msg);
msg= msg.concat ("world");
 System.out.println(msg);
 
 msg  = msg.concat (name);
 System.out.println( msg);
 
 
 //string literal
 
 String l1="java";
 System.out.println(l1.hashCode());
 String l2= "Python";
 System.out.println((l2.hashCode()));
 String l3="c";
 System.out.println(l3.hashCode());
 
 
 String n1 = new String("abc");
 String n2 = new String ("xyz");
 String n3 = new String ("abe");
 /* if (n1==n2)
  {
	  System.out.println("values are same ");
  
  }*/
 
 
 System.out.println(n1);
 System.out.println(n2);
 System.out.println(n3);
 System.out.println(n1 + n2 + n3);
 
 //String comparison

 int a =10 ;
 int b = 10;
 if (a==b)
 {
	 System.out.println("hi");
 }
	}
	
}
