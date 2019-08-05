import java.util.*;
class Task1
{
	public static void main(String[] args) 
	{
		String name;
		int a;
		char b;
		short c;
		float d;
		double e;
		long f;
		byte g;
		boolean h;
	 	Scanner input = new Scanner(System.in);

		System.out.print("String:");
		name = input.nextLine();

		System.out.print("Char:");
		b = input.next().charAt(0);

		System.out.print("Int:");
		a = input.nextInt();

		System.out.print("Short:");
		c = input.nextShort();

		System.out.print("Float:");
		d = input.nextFloat();

		System.out.print("Double:");
		e = input.nextDouble();

		System.out.print("Long:");
		f = input.nextInt();

		System.out.print("Byte:");
		g = input.nextByte();

		System.out.print("Boolean:");
		h = input.nextBoolean();
	}
}
