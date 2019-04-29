import java.util.*;
class Lab3task3
{
	public static void main(String[] args) 
	{
		Scanner alpha=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch =alpha.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I': 
            case 'O': 
            case 'U':
          System.out.println(ch + " is vowel");
            break;
            default:
          System.out.println(ch + " is consonant");
        }

	}
}