package Task_3;

import java.util.*;

public class Application {
	
	public static void main(String args[])
	{	
		
		char c='y';
		while(c=='y')
		{
			int a,b;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter first operand");
			a=s.nextInt();
			System.out.println("Enter second operand");
			b=s.nextInt();
			System.out.println("Choose an operator");
			System.out.println("Addition : +");
			System.out.println("Subtraction : -");
			System.out.println("Multiplication : *");
			System.out.println("Division : /");
			char ch=s.next().charAt(0);
			Calculator res=new Calculator();
			switch(ch)
			{
				case '+':System.out.println("Result of "+a+ " + " +b+ "is " +res.add(a,b));break;
				case '-':System.out.println("Result of "+a+ " - " +b+ "is " +res.sub(a,b));break;
				case '*':System.out.println("Result of "+a+ " x " +b+ "is " +res.mul(a,b));break;
				case '/':System.out.println("Result of "+a+ " / " +b+ "is " +res.div(a,b));break;
				default:System.out.println("Sorry....Invalid Operator");
		
			}
		
		System.out.println("do you want to perform another operation [y/n]");
		c=s.next().charAt(0);
		}
	}
	
}