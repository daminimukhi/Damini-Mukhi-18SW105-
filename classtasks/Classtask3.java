import java.util.*;
class Classtask3 {
	public static void main(String[]args)
	{

     Scanner factorial = new Scanner(System.in);

     System.out.println("Enter number: ");

     int num = factorial.nextInt();

     int result = 1;

     for(int i=1; i<=num; i++)

    {

      result = result * i;
    }
      System.out.println(" The factorial of : " + num + "  is  : " + result);
        
	}
}