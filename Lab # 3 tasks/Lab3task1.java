import java.util.*; 
class Lab3task1 
{
	public static void main(String[]args)
    {
	   Scanner user = new Scanner(System.in);
	   int total_marks=300;
	   System.out.println("Enter marks of c plus: "); 
	   int c_plus = user.nextInt();
	   System.out.println("Enter marks of data structure:");
	   int data_structure = user.nextInt();
	   System.out.println("Enter marks of operating system: ");
	   int operating_system = user.nextInt(); 
	   int Obtained_marks = c_plus + data_structure + operating_system;

       System.out.println("**************************************");
	   System.out.println("Total Marks are : " + total_marks);
       System.out.println("**************************************");
       System.out.println("Obtained Marks are : " + Obtained_marks);
       System.out.println("**************************************");
	   double percentage = (Obtained_marks*100)/total_marks; 
       System.out.println("**************************************");
       System.out.println("Percentage is: " + percentage);
       System.out.println("**************************************");
       if(percentage > 90)
     {
       System.out.println("GRADE = A");
     }
       if(percentage > 80 && percentage < 90)
     {
        System.out.println("GARDE = B");
     }
       if(percentage > 70 && percentage < 79)
     {
       System.out.println("GRADE = C"); 
     }
       if(percentage > 60 && percentage < 69)
     {
       System.out.println("GRADE = D");
     }
       if(percentage > 50 && percentage < 59)
     {
       System.out.println("GRADE = FAIL");
     }

    }   
  
}