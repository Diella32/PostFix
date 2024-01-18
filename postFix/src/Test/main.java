package Test;
import postFixPD.PostFixTest;

public class main {
	public static void main(String[] args)
	{
		System.out.print("2 3 4 + * = "); 
		String stringUsed = "2 3 4 + *"; 
		PostFixTest objectUsed = new PostFixTest(); 
		System.out.println(objectUsed.calculator(stringUsed)); 
	}
}
