package stringprogram;

public class Stringample {

	public static void main(String[] args)
	{
		
		String s="Hello";
		System.out.println(s);
		String s1=new String("hello s1");
		System.out.println(s1);
		String s3="";
		
		
		//charAt() method - To return the character of the String based on the index position
		System.out.println(s.charAt(0));
		System.out.println(s1.charAt(6));
		
		//length() method - To return length of the string
		System.out.println(s1.length());
		System.out.println(s.length()); //Length - 5, Index -4
		
		//concat() method - To add 2 string/ add one in to a existing string
		
		System.out.println(s.concat(s1));
		System.out.println(s1.concat(s));
		
		System.out.println(s1.concat("Concat"));
		
		//contains() method - To check the availability of a string or character in the String.
		
		System.out.println(s1.contains(s));
		System.out.println(s.contains("p"));
		System.out.println(s.contains("o"));
		
		//isEmpty() method - To check string is empty or not
		
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println(s3.isEmpty());
		
		//toLowerCase() method-To convert in to Lower case
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s1.toUpperCase());
		
		//toUpperCase() method--To convert in to lower case in to  upper case
		
	System.out.println(s.toLowerCase());
		
		System.out.println(s1.toLowerCase());
		
		//valueOf() method  - conversion of any data types to String 
		
		int a = 5;
		System.out.println(String.valueOf(a));
		
		
		//Equals -To check strings are equal or not
		
		String a1="Java";
		//String a2="JAVA";
		//String a3= new String ("Java");
		
		System.out.println(a1);
		
	}
}
