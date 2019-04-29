import java.util.*;
class Lab3task4 
{
	public static void main(String[]args)
	{
		int firstnum = Integer.parseInt(args[0]);
		int secondnum = Integer.parseInt(args[1]);
		char operator = args[2].charAt(0);

	    switch(operator) 
		{
			case '-':
			System.out.println("Subtraction of two numbers is :" + (firstnum - secondnum));
			break;

			case '+':
			System.out.println("Addition of two numbers is :" + (firstnum + secondnum));
            break;

			case '/':
	     	System.out.println("Division of two numbers is :" + (firstnum / secondnum));
            break;  

			case '*':
			System.out.println("Multiplication of two numbers is :" + (firstnum * secondnum));
            break;
        }
	}
}