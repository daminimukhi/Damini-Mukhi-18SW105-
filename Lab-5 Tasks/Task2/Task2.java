import java.util.*;
class Array
{
	Scanner input = new Scanner(System.in);
	int[] array = new int[10];



	void populate_Array()
	{
		int x=1;
		for(int i = 0; i<array.length ; i++)
		{
			System.out.print("Enter the element no " + x++ + " :");
			array[i] = input.nextInt();
		}
    }
	void odd_Numbers()
	{
		for (int i = 0 ; i<array.length ; i++)
		{
			if(array[i] % 2 != 0)
			{
				System.out.print(array[i] + " ");
			}
		}
	}

	void even_Numbers()
	{
		for(int i = 0 ; i<array.length ; i++)
		{
			if(array[i] % 2 == 0)
			{
				System.out.print(array[i] + " ");
			}
		}
	}
}

class Task2
{
	public static void main(String[] args)
	{
		Array A1 = new Array();
		A1.populate_Array();
		System.out.println("Even Numbers Are Written Bellow");
		A1.even_Numbers();
		System.out.println("\n \n \nOdd Numbers Are Written Bellow");
		A1.odd_Numbers();
	}
}
