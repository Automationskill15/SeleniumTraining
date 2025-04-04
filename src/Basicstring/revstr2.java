package Basicstring;

public class revstr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gitika";
		
		char[] reverse = new char [name.length()];
		
		int length = name.length() -1 ;
		
		for (i = 0; i <= length ; i++)
		{
			reverse[i] =name.charAt(length-1); 	
		}
		System.out.println(reverse);

	}

}
