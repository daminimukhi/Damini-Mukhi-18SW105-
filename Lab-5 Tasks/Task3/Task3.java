import java.util.*;
class Dog
{
	Scanner input = new Scanner(System.in);
	String name;
	String breed;
    int age;

    void set_Details(String n , String b, int a)
    {
    	name = n;
    	breed = b;
    	age = a;
    }

    void show_Details()
    {
    	if(name!=null && breed!=null && age!=0)
    	{
    	System.out.println("Name:" + name + "\nBreed:" + breed + "\nAge:" + age);
    	}
    	else 
    		System.out.print("Details Are Unavailable");
    }
}


class Task3
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		d1.set_Details("Kutta" , "German Shepherd" , 18);
		d1.show_Details();
	}
}
