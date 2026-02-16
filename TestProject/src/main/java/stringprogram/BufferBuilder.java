package stringprogram;

public class BufferBuilder {

	public static void main(String[] args)
	
{
//StringBuilder	
StringBuilder sb= new StringBuilder("Hi");
System.out.println(sb);

//StringBuffer

StringBuffer sbs = new StringBuffer("Hello");
System.out.println(sbs);

//insert() method - To insert new word/string/chara to present string based on index position
System.out.println(sb.insert(2, "welcome"));
System.out.println(sb); //changed to new value


//append() method - To add a new string at the end of the current string
System.out.println(sb.append(sbs));
System.out.println(sbs.append("Append"));

//replace() method- To replace the charactor /word of  a string based on the index position.Starting and Ending position

System.out.println(sb.replace(9,14,"String")); //replace charac starting 10th to 14th position

//delete() method - To delete character/word via index method

System.out.println(sb.delete(9,14));

//reverse() method -To reverse the string

System.out.println(sb.reverse());
System.out.println(sbs.reverse());


	}

}